package com.codewithakash.corejava.lesson5.collections;

import java.util.*;

public class HashMapConcept {


    public static void main(String[] args) {


        Employee emp1 = new Employee(101, "Akash", "Pune");
        Employee emp2 = new Employee(101, "Akash", "Pune");
        Employee emp3 = new Employee(102, "Dan", "UK");
        Employee emp4 = new Employee(103, "Elif", "USA");


        System.out.println(emp1.toString());
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);

        System.out.println("<<<<<<<Testing equals method without hashcode overriding>>>>>>>");
        System.out.println(emp1.equals(emp2));

        System.out.println("--------Hashcode of employee Object---------");
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
        System.out.println(emp3.hashCode());
        System.out.println(emp4.hashCode());


        System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>");


        Map<Employee, String> map1 = new HashMap<Employee, String>();

        map1.put(emp1, "INFOSYS");
        map1.put(emp2, "Oracle");
        map1.put(emp3, "IAS");
        map1.put(emp4, "BOSCH");

        System.out.println(map1.get(emp1));

        System.out.println(map1.get(emp1));
        System.out.println(map1.get(emp2));
        System.out.println(map1.get(emp3));
        System.out.println(map1.get(emp4));
        System.out.println(map1);


        //using entrySet() method
        for (Map.Entry<Employee, String> empName : map1.entrySet()) {
            System.out.println("Key-->" + empName.getKey() + "   Value-->" + empName.getValue());

        }

        //Using forEach action lambda expression
        map1.forEach((k, v) -> System.out.println("key--" + k + "value" + v));


        //System.out.println(map1.entrySet());

        //using iterator
        Iterator<Map.Entry<Employee, String>> itr = map1.entrySet().iterator();
        while (itr.hasNext()) {

            Map.Entry<Employee, String> temp = itr.next();
            System.out.println("Key--->" + temp.getKey() + "   Value--->" + temp.getValue());

            List<Integer> list = new ArrayList<>();

            list.add(10);
            list.add(new Integer(2));
            list.add(56);
            list.add(11);
            list.add(new Integer(12));
            list.add(5);
            list.add(13);
            list.add(new Integer(21));
            list.add(13);

            System.out.println(list);

            list.remove(2);

            System.out.println(list);

            list.remove(new Integer(13));
            list.add(13);
            list.add(new Integer(21));


            System.out.println(list);

            Iterator<Integer> itr1 = list.iterator();
            while (itr1.hasNext()) {
                int x = itr1.next();
                System.out.println(x + " ");
            }


        }


    }

}

