package com.littlezheng.arithmetic.ds;

import org.junit.jupiter.api.Test;

public class App {
    
    public static void main(String[] args) {
        List<Object> list = new LinkedList<Object>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(list);
        System.out.println(list);
        list.forEach(new Consumer<Object>() {
            
            @Override
            public void on(int index, Object e) {
                System.out.println(index + ": " + e);
            }
        });
        
//        System.out.println(list.get(-5));
    }

    @Test
    public void testAdd(){}
    
}
