package com.company;

import java.util.*;


public class SetClassTruck {

    private NavigableSet<Truck> set;
    private final int ETALON = 49;

    {
        set = new TreeSet<>();
    }

    Truck t2 = new Truck(5);
    Truck t3 = new Truck(4);
    Truck t4 = new Truck(8);
    Truck t5 = new Truck(6);
    Truck t6 = new Truck(11);
    Truck t9 = new Truck(15);
    Truck t17 = new Truck(1);

    Iterator iterator = set.iterator();

    public int getSum() {

        int sum = 0;
        for (Truck truck : set) {
            sum += truck.getWEIGHT();
        }
        return sum;
    }

    public void checkWeight() {

        if (getSum() > getETALON()) {
            NavigableSet<Truck> set1 = new TreeSet();
            set1.addAll(set);
            int delivery = getSum() - getETALON();
            Truck truck = new Truck(delivery);
            Object o = set1.higher(truck);
            if (o == null) {
                System.out.println("Добавлено слишком много грузов");
            } else {
                set1.remove(set1.higher(truck));
                set = set1;
                System.out.println(set);
            }
        } else {
            System.out.println("Проверка выполнена, вес в норме");
        }
    }

    public NavigableSet<Truck> deleteAllStartOfHead() {
        while (!set.isEmpty()) {
            set.pollFirst();
            System.out.println(set);
        }
        return set;
    }

    class Truck implements Comparable<Truck> {

        private final int WEIGHT;

        public Truck(int WEIGHT) {
            this.WEIGHT = WEIGHT;
            set.add(this);

        }

        public int getWEIGHT() {
            return WEIGHT;
        }


        @Override
        public String toString() {
            return "Truck{" +
                    "WEIGHT=" + WEIGHT +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Truck)) return false;
            Truck truck = (Truck) o;
            return getWEIGHT() == truck.getWEIGHT();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getWEIGHT());
        }

        @Override
        public int compareTo(Truck o) {
            return this.WEIGHT - o.WEIGHT;
        }
    }

    public int getETALON() {
        return ETALON;
    }

    public NavigableSet<Truck> getSet() {
        return set;
    }
}
