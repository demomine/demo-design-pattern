package com.lance.demo.pattern.decorator;

public class DecoratorDemo {
    public void decorator() {
        Project employe = new Employee();        //代码工人
        Project managerA = new ManagerA(employe); //项目经理
        Project managerB = new ManagerB(employe); //项目经理
        //以经理的名义将编码完成，功劳都是经理的，实际编码的是工人
        managerA.doing();
        managerB.doing();
    }
}
