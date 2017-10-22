package com.lance.demo.pattern.vote;

import java.util.*;

/**
 * Created by immerer on 2017/10/22.
 */
public class VoteManager {
    private final Map<String, Map<String,Integer>> userMap = new HashMap<>();
    private final Map<String, Integer> voteMap = new HashMap<>();
    VoteState normalVoteState = new NormalVoteState();
    VoteState spiteVoteState = new SpiteVoteState();
    VoteState blackVoteState = new BlackVoteState();
    VoteState errorVoteState = new ErrorVoteState();

    public Map<String, Integer> getVoteMap() {
        return voteMap;
    }

    public Map<String, Map<String,Integer>> getUserMap() {
        return userMap;
    }


    public void vote(String user, String item) {
        Map<String,Integer> map  = userMap.get(user);
        int count = 0;
        if (map != null) {
            count = map.values().stream().mapToInt(key->key).sum();
        }

        if (count >=0 && count<= 3 ) {
            normalVoteState.process(user,item,this);
        } else if (count > 3 && count <= 5) {
            spiteVoteState.process(user,item,this);
        } else if (count > 5) {
            blackVoteState.process(user,item,this);
        } else {
            errorVoteState.process(user,item,this);
        }

    }

    public void check() {
        voteMap.forEach((key,value)-> System.out.println(key+" 得票数: "+value));
    }


}
