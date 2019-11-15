package io;

import java.io.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class WriteFile {
    public static void main(String[] args) throws Exception{
        long start = System.currentTimeMillis();
        Write2FileByOutputStream("C:\\Users\\lee\\Desktop\\bulkloadcolsrandom.txt");
        long end = System.currentTimeMillis();
        //System.out.println(end - start);
       /* HashSet<String> set = new HashSet<>(10005);
        for (int j = 1; set.size() <= 10000; ) {
            int i = 732;
            int i1 = randInt(i * 10000,i * 10000 + 10000);
            String str = i1 + "," + "a" + "," + i1 +"," + "b"  + "," + (i1 + 10);
            if(!set.contains(str)){
                set.add(str);
            }
        }
        for (String integer : set) {
            System.out.println(integer);
        }
*/
    }
    public static int randInt(int min, int max) {
        Random random = new Random();
        int randomNum = random.nextInt((max - min) + 1) + min;
        if(randomNum == 4340000){
            System.out.println(min + "," + max);
        }
        return randomNum;
    }

    public static void Write2FileByOutputStream(String filename) {
        File file = new File(filename);
        FileOutputStream fos = null;
        // BufferedOutputStream bos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            Random random = new Random();
            fos = new FileOutputStream(file);
            osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);
            for (int i = 1; i <= 1000 ; i ++) {//4340000  100000 7320000
                HashSet<String> set = new HashSet<>(10005);
                Set<String> strings = Collections.synchronizedSet(set);//7320000 7309126 7314430
                for (int j = 1; set.size() < 10000; ) {
                    int i1 = randInt(i * 10000 + 1,i * 10000 + 10000);
                    if(i == 1){
                        i1 = randInt(i ,10000);
                    }
                    String str = i1 + "," + "a" + "," + i1 +"," + "b"  + "," + (i1 + 10);

                    if(!strings.contains(str)){
                        if(i1 == 4340000){
                            System.out.println("*******");
                            System.out.println(i1);
                            System.out.println("*******");
                        }
                        strings.add(str);
                        bw.write(str);
                        bw.newLine();
                    }
                    /*if(i1 == 4340000){
                        System.out.println(str);
                    }*/
                }
                bw.flush();
                //System.out.println(i);

            }

            // bos = new BufferedOutputStream(fos);
            // bos.write("Write2FileByOutputStream".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != osw) {
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != fos) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
