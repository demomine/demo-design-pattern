package com.lance.demo.pattern.mediator;

/**
 * Created by immerer on 2017/10/22.
 */
public class MediatorDemo {
    public void mediate() {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);

        mediator.setConcreteColleagueA(colleagueA);
        mediator.setConcreteColleagueB(colleagueB);

        colleagueA.operationA();

        colleagueB.operationB();
    }
}
