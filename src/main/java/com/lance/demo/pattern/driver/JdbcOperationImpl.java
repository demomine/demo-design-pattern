package com.lance.demo.pattern.driver;

/**
 * Created by immerer on 2017/10/22.
 */
public class JdbcOperationImpl extends JdbcOperation {

    public JdbcOperationImpl(Driver driver) {
        super(driver);
    }

    @Override
    public void insert(String sql) {
        driver.execute(sql);
        System.out.println("insert success");
    }

    @Override
    public void delete(String sql) {
        driver.execute(sql);
        System.out.println("delete success");
    }
}
