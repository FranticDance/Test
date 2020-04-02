package io;

import alluxio.exception.AlluxioException;
import com.datasw.filesystem.core.AlluxioFileSystemComponent;

import java.io.IOException;
import java.util.List;

/**
 * @author lee
 * @version 1.0
 * @date 2019/11/20 16:56
 */
public class ReadFromFile {
    public static void main(String[] args) throws IOException, AlluxioException {
        AlluxioFileSystemComponent root = new AlluxioFileSystemComponent("root", "172.18.1.102", "19998");
        List<String> strings = root.openFile("/a.txt");
        System.out.println(strings);

    }

    public static void say(String name) {
        System.out.println("hi");
    }


}
