package com.lance.demo.designpatther.filter;

public class FilterBootstrap {
    public static void main(String[] args) {
        String value= "hello world";
        LogFilter logFilter = new LogFilter();
        RenameFilter renameFilter = new RenameFilter();
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(logFilter).addFilter(renameFilter).doFilter(value,filterChain);
        System.out.println("finally value : " + value);
    }
}
