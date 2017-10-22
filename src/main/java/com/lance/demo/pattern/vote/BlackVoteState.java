package com.lance.demo.pattern.vote;

import java.util.Map;

/**
 * Created by immerer on 2017/10/22.
 */
public class BlackVoteState implements VoteState{
    @Override
    public void process(String user, String voteItem, VoteManager voteManager) {
        System.out.println("用户："+ user+"  禁止投票 ");
    }
}
