package com.lance.demo.pattern.vote;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by immerer on 2017/10/22.
 */
public class VoteManagerTest {
    @Test
    public void vote() throws Exception {
        VoteManager voteManager = new VoteManager();
        voteManager.vote("lance", "a");
        voteManager.vote("lance", "a");
        voteManager.vote("lance", "a");
        voteManager.vote("lance", "b");

        voteManager.vote("immerser", "a");
        voteManager.vote("immerser", "b");
        voteManager.vote("immerser", "b");
        voteManager.vote("immerser", "b");
        voteManager.vote("immerser", "b");
        voteManager.vote("immerser", "b");
        voteManager.vote("immerser", "b");

        voteManager.vote("perdoanre", "a");
        voteManager.vote("perdoanre", "a");

        voteManager.check();
    }

}