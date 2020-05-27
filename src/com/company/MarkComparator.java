package com.company;

import java.util.Comparator;

public class MarkComparator extends Student implements Comparable<Student> {

    public MarkComparator(String name, int age, int mark) {
        super(name, age, mark);
    }

    public MarkComparator() {
    }

    public Comparator<Student> ageComporator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getAge() - o2.getAge();
        }
    };
    public Comparator<Student> markComporator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getMark() - o2.getMark();
        }
    };

    public Comparator<Student> markNameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            int x = o1.getMark() - o2.getMark();
            if (x == 0) x = o1.getName().compareTo(o2.getName());
            return x;
        }
    };

}
