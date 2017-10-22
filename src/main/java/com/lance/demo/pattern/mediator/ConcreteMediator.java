package com.lance.demo.pattern.mediator;

/**
 * Created by immerer on 2017/10/22.
 */
public class ConcreteMediator implements Mediator{
    private ConcreteColleagueA concreteColleagueA;
    private ConcreteColleagueB concreteColleagueB;


    @Override
    public void changed(Colleague colleague) {
        if (colleague instanceof ConcreteColleagueA) {
            concreteColleagueB.hello();
        } else {
            concreteColleagueA.hello();

        }
    }


    public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
        this.concreteColleagueA = concreteColleagueA;
    }

    public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
        this.concreteColleagueB = concreteColleagueB;
    }
}
