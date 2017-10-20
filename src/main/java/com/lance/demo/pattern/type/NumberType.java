package com.lance.demo.pattern.type;



/**
 * Created by immerer on 2017/10/21.
 */
public class NumberType implements Type {
    private int num;

    public NumberType(int num) {
        this.num = num;
    }

    @Override
    public void type(TypeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getResult() {
        return String.valueOf(num);
    }

    @Override
    public void getSquare() {
        System.out.println("num" + num * num);
    }
}
