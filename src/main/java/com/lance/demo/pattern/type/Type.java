package com.lance.demo.pattern.type;



/**
 * Created by immerer on 2017/10/20.
 */
public interface Type {
    void type(TypeVisitor visitor);

    String getResult();

    void getSquare();
}
