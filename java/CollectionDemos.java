package CollectionDemo.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemos {
    public static void show(){
        Collection<String> collection= new ArrayList<>();
        Collections.addAll(collection, "a","b","c");
//        var containA=collection.contains("a");
        Object[] objectArray= collection.toArray();
        System.out.println(containA);
//        System.out.println(collection.size());
//        collection.add("a");
//        collection.add("b");
//        collection.add("c");
//        for (var item: collection) {
//            System.out.println(item);
//        }
    }
}
