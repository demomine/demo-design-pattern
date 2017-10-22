package com.lance.demo.pattern.driver;

/**
 * Created by immerer on 2017/10/22.
 */
public class OracleDriver implements Driver {
    @Override
    public void execute(String sql) {
        System.out.println("execute oracle " + sql
        );
    }
}
