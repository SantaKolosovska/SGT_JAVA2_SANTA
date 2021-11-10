package lesson20;

import java.util.HashMap;
import java.util.Map;

public class Lesson20Maps {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<String, Integer>();

        students.put("Santa", 34);
        students.get("Santa");          // 34
        students.containsKey("Santa");  // true
        students.containsValue(34);     //true
        students.put("Santa", 99);      // overwrites old value, because map can't contain duplicates



    }
}
