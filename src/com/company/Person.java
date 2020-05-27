package com.company;

import java.util.*;

public class Person {

    private static LinkedList list;
    private static LinkedList list1;
    private static ArrayDeque deque;
    private static Deque deque2;

    static {
        list = new LinkedList();
        list1 = new LinkedList();
        deque = new ArrayDeque();
        deque2 = new LinkedList();
    }

    private String name;

    public Person(String name) {
        this.name = name;
        list.add(this);
        list1.add(this);
        deque.add(this);
        deque2.add(this);

    }

    public static LinkedList getList() {
        return list;
    }

    public static LinkedList getList1() {
        return list1;
    }

    public static ArrayDeque getDeque() {
        return deque;
    }

    public static Deque getDeque2() {
        return deque2;
    }

    public void print(LinkedList list) {
        System.out.println(Arrays.toString(list.toArray()));
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    public String getName() {
        return name;
    }


}
