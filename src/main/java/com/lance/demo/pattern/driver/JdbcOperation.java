package com.lance.demo.pattern.driver;

/**
 * Created by immerer on 2017/10/22.
 */
public abstract class JdbcOperation {
    protected Driver driver;

    public JdbcOperation(Driver driver) {
        this.driver = driver;
    }

    public abstract void insert(String sql);
    public abstract void delete(String sql);
}
