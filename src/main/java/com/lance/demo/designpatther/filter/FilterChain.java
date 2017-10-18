package com.lance.demo.designpatther.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
    private List<Filter> list = new ArrayList<>();
    private int index = 0;
    @Override
    public void doFilter(String value, FilterChain filterChain) {
        if (index == list.size()) {
            System.out.println("value in chain: " + value);
            return;
        }
        Filter filter = list.get(index);
        index++;
        filter.doFilter(value,filterChain);
    }

    public FilterChain addFilter(Filter filter) {
        list.add(filter);
        return this;
    }
}
