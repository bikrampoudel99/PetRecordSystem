package week17.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Orange");
        fruits.add(1,"Grapes");
        //fruits.clear();

        // System.out.println(fruits.contains("Banana"));

        // System.out.println(fruits.get(2));

        //System.out.println(fruits.indexOf("Orange"));

        //fruits.clear();

        //System.out.println(fruits.isEmpty());

        //System.out.println(fruits.lastIndexOf("Orange"));

        // fruits.remove("Orange");



        //fruits.removeAll(Arrays.asList("Orange"));

        //System.out.println(fruits.size());

        //fruits.remove(2);

        fruits.set(2,"Banana");

        System.out.println(fruits);


    }
}
