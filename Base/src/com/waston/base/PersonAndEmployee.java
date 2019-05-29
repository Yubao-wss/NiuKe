package com.waston.base;

/**
 * @Description: 编译报错
 * @Author: Waston
 * @Date: 2019/5/29 18:55
 */
class Person{
    String name = "No name";
    public Person(String nm){
        name = nm;
    }
}
class Employee extends Person{
    String empID = "0000";
    public Employee(String id) {
        super("a"); //原题中没有super，编译报错
        empID = id;
    }
}
public class PersonAndEmployee {
    public static void main(String[] args) {
        Employee e = new Employee("123");
        System.out.println(e.empID);
    }
}
