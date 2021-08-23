package com.codewithakash.java8;

import java.util.*;

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {

        if (o1 < o2) {
            return -1;
        } else if (o1 > o2) {
            return 1;
        } else {
            return 0;
        }


    }


}

public class UsingCollection {

    public static void main(String[] args) {

        String[] arrayString = new String[]{"akash", "aman"};
        List<String> listString = new ArrayList<>(Arrays.asList(arrayString));
        System.out.println(listString);
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(24);
        list.add(3);
        list.add(11);
        list.add(9);

        System.out.println(list);
        //MyComparator c = new MyComparator();
        Comparator<Integer> c = (a, b) -> {
            return (a < b) ? -1 : (a > b) ? 1 : 0;
        };


        Collections.sort(list, c);
        System.out.println(list);

        // to iterate list one by one

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }

        // using stream method of collections
        list.stream().forEach(System.out::println); //:: method reference concept

        //Collectors.toList() -- from 1.8 vv imp
        //Collections.sort(list); -- uses comparable Interface.
        //System.out.println(list);

        List<Integer> someList = new ArrayList<>();
        someList.add(10);
        someList.add(12);
        someList.add(34);


        System.out.println("Checking Final reference variable");
        List<Integer> testList = Collections.unmodifiableList(new ArrayList<>(someList));


        System.out.println(testList);

        //testList.add(10);
        //testList.add(20);
        testList.remove(0);


        System.out.println(testList);


    }

}
