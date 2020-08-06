package thread;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lee
 * @version 1.0
 * @date 2019/12/27 10:13
 */
public class Test3 {
    public static void main(String[] args) {
        String file = "D:\\exportDatabase.json";
        String s = readJsonFile(file);
        JSONArray objects = JSON.parseArray(s);
        List<String> objects1 = getTableList("2", objects);
        //System.out.println(objects1);
        JSONArray member = getTableColumnList("2", objects, "member");
        System.out.println(member);
    }
    public static JSONArray getTableColumnList(String datasourceId, JSONArray data, String tableName){
        JSONArray tableList = null;
        JSONArray columns = null;
        for (Object object : data) {
            JSONObject obj = (JSONObject) object;
            String id = String.valueOf(obj.get("id"));
            if (StringUtils.equals(datasourceId, id)) {
                tableList = (JSONArray)obj.get("tables");
                for (Object tableObject : tableList) {
                    JSONObject object1 = (JSONObject) tableObject;
                    String tableName1 = String.valueOf(object1.get("tableName"));
                    if (StringUtils.equals(tableName1, tableName)) {


                        columns = (JSONArray)object1.get("columns");
                    }
                }
            }
        }
        return columns;
    }

    public static List<String> getTableList(String datasourceId, JSONArray data){
        JSONArray tableList = null;
        for (Object object : data) {
            JSONObject obj = (JSONObject) object;
            String id = String.valueOf(obj.get("id"));
            if (StringUtils.equals(datasourceId, id)) {
                tableList = (JSONArray)obj.get("tables");
            }
        }
        List<String> result = new ArrayList<>();
        tableList.forEach(x -> {
            JSONObject obj = (JSONObject) x;
            String tableName = String.valueOf(obj.get("tableName"));
            result.add(tableName);
        });
        return result;
    }


    public static String readJsonFile(String fileName) {
        String jsonStr = "";
        try {
            File jsonFile = new File(fileName);
            FileReader fileReader = new FileReader(jsonFile);

            Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
