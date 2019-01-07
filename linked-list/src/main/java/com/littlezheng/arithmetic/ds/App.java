package com.littlezheng.arithmetic.ds;

import org.junit.jupiter.api.Test;

public class App {
    
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        System.out.println(list);
        
        System.out.println(list.get(-5));
    }

    @Test
    public void testAdd(){}
    
}
