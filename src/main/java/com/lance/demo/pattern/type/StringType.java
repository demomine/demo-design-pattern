package com.lance.demo.pattern.type;



/**
 * Created by immerer on 2017/10/21.
 */
public class StringType implements Type {
    private String value;

    public StringType(String value) {
        this.value = value;
    }

    @Override
    public void type(TypeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getResult() {
        return value;
    }

    @Override
    public void getSquare() {
        System.out.println("error to square");
    }
}
