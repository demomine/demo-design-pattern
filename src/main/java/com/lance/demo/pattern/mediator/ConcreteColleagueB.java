package com.lance.demo.pattern.mediator;

/**
 * Created by immerer on 2017/10/22.
 */
public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void hello() {
        System.out.println("colleague B");
    }

    public void operationB(){
        //在需要跟其他同事通信的时候，通知调停者对象
        System.out.println("I am B");
        getMediator().changed(this);
    }
}
