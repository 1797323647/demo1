package demo4;

import java.util.*;

/**
 * 80人去4个景点，统计出四个景点分别有多少人想去
 */
public class MapTest {
    public static void main(String[] args) {
        //定义一个集合。存放所有景点信息
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        //定义一个stringBuilder，用于存储所有意见
        StringBuilder sb = new StringBuilder();
        //产生随机数，模拟投票
        Random random = new Random();
        //随机循环出所有意见
        for (int i = 0; i < 80; i++) {
            //字符串存放所有意向
            sb.append(arrayList.get(random.nextInt(4)));
        }
        System.out.println(sb);
        //定义一个map集合，用来统计所有意向
        Map<Character, Integer> map = new HashMap<>();
        //遍历所有意见，
        for (int i = 0; i < sb.length(); i++) {
            //当前遍历到的值赋给零时变量
            Character character = sb.charAt(i);
            //map集合找到已有元素，则值加一，否则添加新值
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }
        System.out.println(map);
    }
}

class MapTest2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "A", "B", "C", "D");
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            String s = list.get(random.nextInt(4));
            sb.append(s);
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);
    }
}
