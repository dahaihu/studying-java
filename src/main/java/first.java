import com.leetcode.IsMatch;
import sun.awt.X11.XSystemTrayPeer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class First {
    // 泛型方法 printArray
    public static <E> void printArray(E[] inputArray) {
        for (E ele : inputArray) {
            System.out.printf("%s", ele);
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        // 创建不同类型数组： Integer, Double 和 Character
//        Integer[] ints = {1, 2, 3, 4, 5};
//        for(Integer ele : ints) {
//            System.out.println(ele);
//        }
//        List<String> l = new ArrayList<String>();
//        l.add("name");
//        l.add("name");
//        l.add("name");
//        for (String ele : l) {
//            System.out.println(ele);
//        }
//        Map<Integer, String> map = new HashMap<Integer, String>();
//        map.put(1, "zhangsan");
//        map.put(2, "lisi");
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + "->" + entry.getValue());
//        }
        IsMatch match = new IsMatch( "aaa", "a*");
        System.out.println(match.isMatch());
    }
}