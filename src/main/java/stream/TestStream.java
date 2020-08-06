package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lee
 * @version 1.0
 * @date 2019/12/24 10:42
 */
public class TestStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aaa");
        list.add("absc");
        list.add("bbb");
        //是否所有的项都是以a开头
        boolean result = list.stream().allMatch(c->{
            return c.startsWith("a");
        });
        System.out.println(result);
        //是否有任何一项是否以a开头
        result = list.stream().anyMatch(c->{
            return c.startsWith("a");
        });
        //是否都不以a开头
        result = list.stream().noneMatch(c->{
            return c.startsWith("a");
        });

        List<String> selectResult = list.stream().filter(value->{
            return value.startsWith("a");
        }).collect(Collectors.toList());
    }
}
