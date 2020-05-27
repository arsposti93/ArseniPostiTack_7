//package com.company;
//
//import java.util.*;
//
//public class Truck implements Comparable <Truck>  {
//
//    private  NavigableSet<Truck> set;
//private final int NUM;
//
//
//     {
//       set = new TreeSet<>();}
//
//    public Truck(int NUM) {
//
//        this.NUM= NUM;
//
//set.add(this);
//    }
//
//    public static NavigableSet<Truck> getSet() {
//        return set;
//    }
//
//    @Override
//    public String toString() {
//        return "Truck{" +
//                "NUM=" + NUM +
//                '}';
//    }
//
//
//    public void print () {
//
//      set.pollLast();
//        for (Object element : set  ) {
//            System.out.print(element);
//        }
//
//    }
//
//       @Override
//    public int compareTo(Truck o) {
//        return this.NUM - o.NUM;
//    }
//}
