package List;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");

        Collections.singletonList(strings);
        System.out.println(strings);
        strings.remove(1);
        System.out.println(strings);

        Object obj = null;
        String s = String.valueOf(obj);
        System.out.println(s);

        Integer integer = new Integer(3);
        byte[] bytes = String.valueOf(integer).getBytes();

        String s1 = String.valueOf(bytes);
        System.out.println(s1);

        Integer[] objects = new Integer[3];
        objects[0] = 1;
        objects[1] = 2;
        objects[2] = 3;
        boolean primitive = objects.getClass().getComponentType().isPrimitive();
        System.out.println(primitive);
        System.out.println(objects.getClass().getComponentType());
        System.out.println(java.lang.Integer.class.isPrimitive());
        System.out.println(new Integer(3).getClass().isPrimitive());
        Object object = 3;
        int a = 3;
        System.out.println(object.getClass().isPrimitive());
        System.out.println();

    }
}
