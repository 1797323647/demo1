package demo4;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraysDemo {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("你好");
        list.add("世界");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
