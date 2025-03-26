package com.example.java_tut.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class CollectionsExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Rahul");
        arrayList.add("Vishesh");
        arrayList.add("Ritikesh");
        arrayList.add("Ramesh");
        arrayList.add("Rakesh");
        arrayList.add("Rajesh");
        arrayList.add("Ramesh");
        arrayList.add("Ritikesh");
//        System.out.println(arrayList);
//        System.out.println(arrayList.size());
//        System.out.println(arrayList.indexOf("Ramesh"));
//        System.out.println(arrayList.lastIndexOf("Ramesh"));
//        arrayList.set(0, "Rahi");
//        arrayList.add(2, "Rahi");
//        System.out.println(arrayList.get(5));
//        arrayList.remove(4);
//        arrayList.remove("Ramesh");
//        Collections.sort(arrayList);
//        Collections.reverse(arrayList);

//        System.out.println(arrayList);
//        System.out.println(arrayList.contains("Ramesh"));
        /*for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        for (String str : arrayList) {

        }*/

        Stack<String> stack = new Stack<>();
        stack.push("Rahul");
        stack.push("Vishesh");
        stack.push("Ritikesh");
        stack.push("Ramesh");
        stack.push("Rakesh");
        stack.push("Rajesh");
        stack.push("Ramesh");
        stack.push("Ritikesh");
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());

//        Collections.sort(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);

        Set<String> sets = new HashSet<>();
        sets.add("Rahul");
        sets.add("Vishesh");
        sets.add("Ritikesh");
        sets.add("Ramesh");
        sets.add("Rakesh");
        sets.add("Rajesh");
        sets.add("Ramesh");
        sets.add("Ritikesh");
//        System.out.println(sets);
        Collections.sort(new ArrayList<>(sets));

        Map<String, String> map = new HashMap<>();
        map.put("1", "Rahul1");
        map.put("2", "Rahul2");
        map.put("3", "Rahul3");
        map.put("4", "Rahul4");
        map.put("5", "Rahul5");
        map.put("6", "Rahul6");
        map.put("7", "Rahul7");
        map.put("5", "Rahul8");
        map.put("5", "Rahul9");
        map.put("5", "Rahul11");
        map.put("5", "Rahul12");
//        map.keySet();
//        map.values();
        map.get("1");
//        System.out.println(map.get("10"));
//        System.out.println(map.getOrDefault("10", "Rahul10"));
//        System.out.println(map);
        map.remove("1");
        map.remove("Rahul7");
//        System.out.println(map);


        Map<Integer, Integer> mapCount = new HashMap<>();
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(8);
        nums.add(7);
        nums.add(7);
        nums.add(7);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(7);
        nums.add(7);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(7);

        for (int i = 0; i<nums.size(); i++){
            mapCount.put(nums.get(i), mapCount.getOrDefault(nums.get(i), 0) + 1);
        }

//        System.out.println(mapCount);




        ArrayList<Student> listItems = new ArrayList<>();

        listItems.add(new Student("School", "class1", 3));
        listItems.add(new Student("Van", "car", 32));
        listItems.add(new Student("Country", "branch", 4));
        listItems.add(new Student("Country", "branch", 2));
        listItems.add(new Student("Country", "branch", 6));
        listItems.add(new Student("Country", "branch", 7));
        listItems.add(new Student("Country", "branch", 8));
        listItems.add(new Student("Collage", "class", 2));
        listItems.add(new Student("Market", "city", 5));
        listItems.add(new Student("Student", "rollno", 71));
        listItems.add(new Student("School", "mall", 6));
        listItems.add(new Student("Van", "city", 8));
        listItems.add(new Student("Country", "city", 7));
        listItems.add(new Student("Collage", "rollno", 9));
        listItems.add(new Student("Student", "branch", 23));
        listItems.add(new Student("Student", "branch", 24));
        listItems.add(new Student("Student", "branch", 25));
        listItems.add(new Student("Student", "branch", 26));
        listItems.add(new Student("Student", "branch", 27));
        listItems.add(new Student("Market", "mall1", 54));
        listItems.add(new Student("School", "class2", 62));
        listItems.add(new Student("Van", "car", 70));
        listItems.add(new Student("Country", "car", 22));
        listItems.add(new Student("Collage", "branch", 18));
        listItems.add(new Student("Collage", "branch", 19));
        listItems.add(new Student("Collage", "branch", 20));
        listItems.add(new Student("Collage", "branch", 21));
        listItems.add(new Student("Collage", "branch", 22));
        listItems.add(new Student("Market", "mall2", 65));
        listItems.add(new Student("Student", "rollno", 51));

//        System.out.println(listItems.size());
//        listItems.remove(new Student("School", "class1", 3));
//        System.out.println(listItems.size());

        System.out.println(listItems);
        Collections.sort(listItems, (student, t1) -> {
            if (student.fathersName.compareTo(t1.fathersName) > 0) {
                return 1;
            } else if (student.fathersName.compareTo(t1.fathersName) < 0) {
                return -1;
            } else {
                if (student.name.compareTo(t1.name) > 0) {
                    return 1;
                } else if (student.name.compareTo(t1.name) < 0) {
                    return -1;
                } else {
                    return student.age - t1.age;
                }
            }
        });
        System.out.println(listItems);
    }

}
