package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list  = new ArrayList<>();
//        list.add("First Value");
//        list.add("Second Value");
//        list.add("Third Value");
//        list.addFirst("!");
        Collections.addAll(list, "a","b","c","d","f","g","h");
        list.set(0,"a-");

        System.out.println(list.subList(0,5));
    }

    public static void clear(){
        List<String> list= new ArrayList<>();
        list.add(0, "Other Name");
        System.out.println(list);

    }
}
