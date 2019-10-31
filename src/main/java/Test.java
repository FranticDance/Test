import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author lee
 */
public class Test {
    public static void main(String[] args) throws Exception{
       String fileName = "C:\\Users\\lee\\Desktop\\数据源Data.txt";
       readFileByLines(fileName);
       /* String pattern = "[\\u4E00-\\u9FA5]+";
        boolean a = Pattern.matches(pattern, "删除");
        System.out.println(a);*/
    }
    public static void readFileByLines(String fileName) throws Exception{
        File file = new File(fileName);
        BufferedReader reader = null;
        String pattern = "[\\u4E00-\\u9FA5]+";
        ArrayList<String> content = new ArrayList<>();
        try {
           // System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                tempString = tempString.trim();
                if(!"".equals(tempString)){
                    /*System.out.println("line " + line + ": " + tempString);
                    line++;*/
                    if(!isContainChinese(tempString)){
                       if(tempString.contains(",")){
                           String[] split = tempString.split(",");
                           for (String s : split) {
                               content.add(s.trim());

                           }
                           continue;
                       }
                        if(tempString.contains("，")){
                            String[] split = tempString.split("，");
                            for (String s : split) {
                                content.add(s.trim());

                            }
                            continue;
                        }
                        if(tempString.contains("\\")){
                            String[] split = tempString.split("\\\\");
                            for (String s : split) {
                                content.add(s.trim());

                            }
                            continue;
                        }
                        if(tempString.contains("、")){
                            String[] split = tempString.split("、");
                            for (String s : split) {
                                content.add(s.trim());

                            }
                            continue;
                        }
                        /*System.out.println("line " + line + ": " + tempString);
                        line++;*/
                        content.add(tempString.trim());

                    }
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }

      /*  for (String s : content) {
            System.out.println(s);
        }*/
       /* Set<String> set = new HashSet<>(content);
        //System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }*/
        List<String> ll = content.stream().distinct().sorted().collect(Collectors.toList());
        //System.out.println(ll.size());
        for (String s : ll) {
            System.out.println(s);
        }
    }

    /**
     2      * 字符串是否包含中文
     3      *
     4      * @param str 待校验字符串
     5      * @return true 包含中文字符 false 不包含中文字符
     6      * @throws EmptyException
     7      */
      public static boolean isContainChinese(String str) throws Exception {

                if (StringUtils.isEmpty(str)) {
                         throw new Exception("sms context is empty!");
                     }
                 Pattern p = Pattern.compile("[\u4E00-\u9FA5|\\！|\\，|\\。|\\（|\\）|\\《|\\》|\\“|\\”|\\？|\\：|\\；|\\【|\\】]");
                 Matcher m = p.matcher(str);
                 if (m.find()) {
                         return true;
                     }
                return false;
             }
}
