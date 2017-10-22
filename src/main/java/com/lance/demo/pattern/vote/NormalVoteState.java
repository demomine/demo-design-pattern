package com.lance.demo.pattern.vote;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by immerer on 2017/10/22.
 */
public class NormalVoteState implements VoteState{
    @Override
    public void process(String user, String voteItem, VoteManager voteManager) {
        Map<String, Map<String, Integer>> userMap = voteManager.getUserMap();
        Map<String,Integer> userVoteMap = userMap.get(user);
        if (userVoteMap == null) {
            userVoteMap = new HashMap<>();
            userVoteMap.put(voteItem, 1);
            userMap.put(user, userVoteMap);
        } else {
            int itemCount = userVoteMap.getOrDefault(voteItem,0);
            if (itemCount == 0 ) {
                userVoteMap.put(voteItem, 1);
            } else {
                userVoteMap.put(voteItem, ++itemCount);
            }
            userMap.put(user, userVoteMap);
        }


        Map<String, Integer> voteMap = voteManager.getVoteMap();
        int items = voteMap.getOrDefault(voteItem,0);
        if (items == 0) {
            voteMap.put(voteItem, 1);
        } else {
            voteMap.put(voteItem, ++items);
        }
        System.out.println("添加投票，投票者: "+user + "  投给  "+ voteItem);
    }
}
