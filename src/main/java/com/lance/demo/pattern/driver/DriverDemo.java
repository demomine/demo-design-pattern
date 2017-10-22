package com.lance.demo.pattern.driver;

/**
 * Created by immerer on 2017/10/22.
 */
public class DriverDemo {
    public void drive() {
        JdbcOperation jdbcOperationMysql = new JdbcOperationImpl(new MysqlDriver());
        jdbcOperationMysql.delete("delete from table");
        jdbcOperationMysql.insert("insert from table");

        JdbcOperation jdbcOperationOracle = new JdbcOperationImpl(new OracleDriver());
        jdbcOperationMysql.delete("delete from table");
        jdbcOperationMysql.insert("insert from table");
    }
}
