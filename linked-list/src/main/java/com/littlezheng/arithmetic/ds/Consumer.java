package com.littlezheng.arithmetic.ds;

public interface Consumer<E> {

    void on(int index, E e);
    
}
