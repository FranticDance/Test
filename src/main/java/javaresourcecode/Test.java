package javaresourcecode;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String str1 = "aaa";
        String str2 = "bbb";
        boolean equals = Objects.equals(str1, str2);
        System.out.println(equals);

        Integer i1 = Integer.valueOf(100);
        Integer i2 = Integer.valueOf(100);
        Integer i3 = 100;
        System.out.println(i3 == i2);

        Integer i5 = Integer.valueOf(200);
        Integer i6 = Integer.valueOf(200);
        System.out.println(i5 == i6);
    }
}
