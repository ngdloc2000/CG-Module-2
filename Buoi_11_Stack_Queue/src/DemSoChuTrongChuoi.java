import com.sun.source.doctree.StartElementTree;

import java.util.Set;
import java.util.TreeMap;

public class DemSoChuTrongChuoi {
    public static void main(String[] args) {
        String str = "Nguyễn Đình Khánh Nguyễn Lộc Nguyễn Lộc";
        int count = 0;
        String[] str_new = str.split(" ");
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String i: str_new) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i,1);
            }
        }
        System.out.println(map);
    }
}
