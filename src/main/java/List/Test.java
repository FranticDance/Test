package List;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        for (String string : strings) {
            strings.remove(string);
        }
        System.out.println(strings);
    }
}
