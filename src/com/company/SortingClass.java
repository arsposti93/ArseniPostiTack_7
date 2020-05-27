package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class SortingClass {

   List list = new ArrayList();

    {
        list.add(new Student("Arseni", 27,8));
        list.add(new Student("Zina",10,7));
        list.add(new Student("Bob",30,6));
        list.add(new Student("Tom",15,1));
        list.add(new Student("Bob",18,7));
    }

    MarkComparator markComparator = new MarkComparator();

    public void sortByName () {
        Collections.sort(list);
        for (Object elemtn: list  ) {
            System.out.println(elemtn);
        }
    }

    public void sortByAge () {
        Collections.sort(list,markComparator.ageComporator);
        for (Object elemtn: list  ) {
            System.out.println(elemtn);
        }
    }

    public void sortByMark () {
        Collections.sort(list,markComparator.markComporator);
        for (Object elemtn: list  ) {
            System.out.println(elemtn);
        }
    }

    public void sortByMarkAndName () {
        Collections.sort(list,markComparator.markNameComparator);
        for (Object elemtn: list  ) {
            System.out.println(elemtn);
        }
    }

    }

