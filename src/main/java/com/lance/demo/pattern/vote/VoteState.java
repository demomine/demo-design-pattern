package com.lance.demo.pattern.vote;

/**
 * Created by immerer on 2017/10/22.
 */
public interface VoteState {
    void process(String user, String voteItem, VoteManager voteManager);
}
