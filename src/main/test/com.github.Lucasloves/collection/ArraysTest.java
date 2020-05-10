package com.github.Lucasloves.collection;

import com.github.Lucasloves.DurianTool;

/**
 * @autohr: Cynaith
 **/
public class ArraysTest {
    public static void main(String[] args) {
        byte[][] init = new byte[2][10];
        init[1] = "string".getBytes();
        init[0] = "test".getBytes();
        String[] res = DurianTool.Arrays().BytesToStrings(null);
        for (int i = 0; i < res.length; i++) {
            System.out.println(init[i]);
            System.out.println(res[i]);
        }
    }
}
