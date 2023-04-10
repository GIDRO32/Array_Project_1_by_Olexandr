package PartIII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo {

    public static void arrayListRemove(ArrayList<Integer> list, int value)
    {
        list.removeAll(Collections.singleton(value));
    }
    public static void insertName(ArrayList<String> list, String name)
    {
        int index = 0;
        while (index < list.size() && list.get(index).compareTo(name) < 0) {
            index++;
        }
        list.add(index, name);
    }

    public static void main(String[] args) {
        // ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 2));

        // add elements to ArrayList
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("date");

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Eve");

        insertName(names, "Dan");
        arrayListRemove(numbers, 2);

        // iterate through ArrayList with enhanced for loop
        System.out.println("\nString ArrayList:");
        for (String str : stringList) {
            System.out.println(str);
        }
        // add element at specific index
        stringList.add(2, "orange");

        // get element at index
        String element = stringList.get(3);
        System.out.println("\nElement at index 3: " + element);

        // set element at index
        stringList.set(1, "grape");

        // remove element at index
        stringList.remove(4);

        // add multiple elements to ArrayList
        ArrayList<String> moreStrings = new ArrayList<>();
        moreStrings.add("fig");
        moreStrings.add("grapefruit");
        stringList.addAll(moreStrings);

        // get index of element
        int index = stringList.indexOf("cherry");
        System.out.println("\nIndex of 'cherry': " + index);

        // remove element
        stringList.remove("apple");

        // ArrayList of Integers
        ArrayList<Integer> intList = new ArrayList<>();

        // add elements to ArrayList
        intList.add(5);
        intList.add(10);
        intList.add(15);
        intList.add(20);

        // add element at specific index
        intList.add(2, 25);
        // iterate through ArrayList with regular for loop
        System.out.println("\nInteger ArrayList:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }
        // get element at index
        int num = intList.get(3);
        System.out.println("\nElement at index 3: " + num);

        // set element at index
        intList.set(1, 30);

        // remove element at index
        intList.remove(4);

        // add multiple elements to ArrayList
        ArrayList<Integer> moreInts = new ArrayList<>();
        moreInts.add(35);
        moreInts.add(40);
        intList.addAll(moreInts);

        // get index of element
        index = intList.indexOf(15);
        System.out.println("\nIndex of '15': " + index);

        // remove element
        intList.remove(Integer.valueOf(5));

        System.out.println("String Array list:");
        System.out.println(names); // prints [Alice, Bob, Charlie, Dan, Eve]
        System.out.println("Int Array list:");
        System.out.println(numbers); // Output: [1, 3, 4]
    }
}
