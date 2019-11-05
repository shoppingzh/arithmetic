package com.littlezheng;

import java.util.Random;
import java.util.Stack;

public class App {

    /**
     * 使用栈进行反转
     * 
     * @param origin
     * @return
     */
    public static int reverseByStack(int origin) {
        Stack<Integer> stack = new Stack<Integer>();
        while (origin != 0) {
            stack.push(origin % 10);
            origin = origin / 10;
        }
        int result = 0;
        for (Integer e : stack) {
            result = result * 10 + e;
        }
        return result;
    }
    
    /**
     * 运算方法
     * @param origin
     * @return
     */
    public static int reverse(int origin) {
        int result = 0;
        while (origin != 0) {
            int end = origin % 10;
            result = result * 10 + end;
            origin = origin / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        
        for (int i = 0; i < 10000000; i++) {
            int origin = new Random().nextInt(Integer.MAX_VALUE);
            reverse(origin);
//            System.out.println("原始数值：" + origin);
//            System.out.println("反转后(直接)：" + reverse(origin));
        }
//        System.out.println("反转后(栈)：" + reverseByStack(origin));
        System.out.println("用时：" + (System.currentTimeMillis() - start) + "ms");
    }

}
