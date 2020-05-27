package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListClass <T> {

    private LinkedList<T> list;

    public ListClass(LinkedList<T> list) {
        this.list = list;
    }

    public void add(LinkedList<T> list) {
        LinkedList<T> list2 = new LinkedList<>();
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                list2.addFirst(list.get(i));
            } else {
                list2.addLast(list.get(i));
            }
        }
        System.out.println(list2);
    }

    public void gameJenga(LinkedList<T> list) {
        int y = (int) (Math.random() * (list.size() - 1) + 1);
        T person = list.get(y);
        list.remove(y);
        list.addLast(person);
        System.out.println(list);
}
}



