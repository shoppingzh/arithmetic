package com.littlezheng.arithmetic.ds;

import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    public void testAdd(){
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.forEach(new Consumer<Integer>() {
            @Override
            public void on(int index, Integer e) {
                System.out.println(e);
            }
        });
    }
    
}
