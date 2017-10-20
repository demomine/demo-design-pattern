package com.lance.demo.pattern.type;

import org.junit.Test;


/**
 * Created by immerer on 2017/10/21.
 */
public class ProcessorTest {

    @Test
    public void process() {
        Type num1 = new NumberType(1);
        Type num2 = new NumberType(3);

        Type str1 = new StringType("str");

        Processor processor = new Processor();
        processor.add(num1);
        processor.add(num2);
        processor.add(str1);


        TypeVisitor squareVisitor = new SquareVisitor();
        processor.accept(squareVisitor);


        TypeVisitor resultVisitor = new ResultVisitor();
        processor.accept(resultVisitor);
    }

}