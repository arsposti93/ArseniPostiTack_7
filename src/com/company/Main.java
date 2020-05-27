package com.company;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("tom");
        Person p2 = new Person("bill");
        Person p3 = new Person("edvard");
        Person p4 = new Person("jak");
        Person p5 = new Person("Fil");
        Person p6 = new Person("Soursanna");
        Person p7 = new Person("Sveta");
        Person p8 = new Person("Liza");

        System.out.println("ИСХОДНЫЙ ЛИСТ:" + Person.getList());
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////
        QueueDeque queueDeque = new QueueDeque(Person.getDeque());
        queueDeque.delete(Person.getDeque());
        System.out.println("---------------------------------------------------------------------------------------");
        queueDeque.delete2(Person.getDeque2());
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("List Class: ");
        ListClass<Person> personListClass = new ListClass<>(Person.getList());
        personListClass.gameJenga(Person.getList());
        System.out.println("---------------------------------------------------------------------------------------");
        personListClass.add(Person.getList1());
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------");
////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("SetClass-CARDS");
        SetClassCards setClassCards = new SetClassCards();
        System.out.println(setClassCards.getSet());
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------");
////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("SetClass-Truck");
        SetClassTruck setClassTruck = new SetClassTruck();
        System.out.println(setClassTruck.getSet());
        setClassTruck.checkWeight();
        setClassTruck.deleteAllStartOfHead();
        System.out.println("---------------------------------------------------------------------------------------");
//////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("MAP-Class");
        MapClass mapClass = new MapClass();
        System.out.println(mapClass.map);
        mapClass.addElementAfterCheckKey("Yoni", "Kirill");
        System.out.println(mapClass.map);
        mapClass.addElementAfterCheckKey("Yoni", "Bacya");
        mapClass.deleteElementByKey("Yoni");
        System.out.println(mapClass.map);
        System.out.println("---------------------------------------------------------------------------------------");
        //////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Sorting-Class");
        SortingClass sortingClass = new SortingClass();
        sortingClass.sortByName();
        System.out.println();
        sortingClass.sortByAge();
        System.out.println();
        sortingClass.sortByMark();
        System.out.println();
        sortingClass.sortByMarkAndName();

    }
}