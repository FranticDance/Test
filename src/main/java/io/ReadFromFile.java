package io;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author lee
 * @version 1.0
 * @date 2019/11/20 16:56
 */
public class ReadFromFile {


    public static void main(String[] args) throws Exception {
        /*AlluxioFileSystemComponent root = new AlluxioFileSystemComponent("root", "172.18.1.102", "19998");
        List<String> strings = root.openFile("/a.txt");
        System.out.println(strings);*/
        int a = 30 * 1000 * 100;
        System.out.println(a);

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(3);
        integers.add(4);
        ArrayList<Integer> integers2 = new ArrayList<>();
        integers2.add(2);
        integers2.add(3);
        integers2.add(6);
        HashSet<Integer> integers1 = new HashSet<>();
        integers1.addAll(integers);
        integers1.addAll(integers2);
        System.out.println(integers1);

        integers.retainAll(integers2);
        System.out.println(integers);
    }

    public static void say(String name) {
        System.out.println("hi");
    }


}
