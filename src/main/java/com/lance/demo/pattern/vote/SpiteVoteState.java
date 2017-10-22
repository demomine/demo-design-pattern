package com.lance.demo.pattern.vote;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by immerer on 2017/10/22.
 */
public class SpiteVoteState implements VoteState {
    private volatile boolean flag = true;
    private final Map<String, Boolean> flagMap = new HashMap<>();

    @Override

    public void process(String user, String voteItem, VoteManager voteManager) {

        Map<String, Integer> map = voteManager.getUserMap().get(user);

        if (map.isEmpty()) {
            System.out.println("error");
            return;
        }

        Map<String, Integer> voteMap = voteManager.getVoteMap();

        if (flagMap.getOrDefault(user,true)) {
            map.forEach((key, value) -> {
                int count = voteMap.get(key);
                count = count - value;
                voteMap.put(key, count);
            });
            flagMap.put(user, false);
        }


        Map<String, Map<String, Integer>> userMap = voteManager.getUserMap();
        Map<String,Integer> userVoteMap = userMap.get(user);

        int itemCount = userVoteMap.getOrDefault(voteItem,0);
        if (itemCount == 0 ) {
            userVoteMap.put(voteItem, 1);
        } else {
            userVoteMap.put(voteItem, ++itemCount);
        }
        userMap.put(user, userVoteMap);

        System.out.println("恶意投票 用户 " + user + "  投票被清空");
    }
}
