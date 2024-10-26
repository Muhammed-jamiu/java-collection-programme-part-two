package CollectionDemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void show(){
        Set<String> set =new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("blue");
        System.out.println(set);
    }
}
