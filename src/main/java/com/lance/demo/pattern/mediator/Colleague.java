package com.lance.demo.pattern.mediator;

/**
 * Created by immerer on 2017/10/22.
 */
public abstract class Colleague {
    private Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void hello();
}
