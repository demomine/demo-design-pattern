package com.lance.demo.pattern.mediator;

/**
 * Created by immerer on 2017/10/22.
 */
public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void hello() {
        System.out.println("colleague A");
    }

    public void operationA(){
        System.out.println("I am A");

        //在需要跟其他同事通信的时候，通知调停者对象
        getMediator().changed(this);
    }
}
