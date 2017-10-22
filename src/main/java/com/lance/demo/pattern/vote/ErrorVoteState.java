package com.lance.demo.pattern.vote;

/**
 * Created by immerer on 2017/10/22.
 */
public class ErrorVoteState implements VoteState {
    @Override
    public void process(String user, String voteItem, VoteManager voteManager) {
        System.out.println("error state");
    }
}
