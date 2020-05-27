package com.company;

import java.util.*;

public class MapClass {

    Map map = new HashMap();

    {
        map.put("Anatoni93", "Anatoli");
        map.put("Saimon-Se", "Simon");
        map.put("Jesikasweet", "Janna");
        map.put("A7p", "Amin Pivovarov");
    }

    public void addElementAfterCheckKey(String str, String str2) {
        Set set = new HashSet(map.keySet());
        if (!set.contains(str)) {
            map.put(str, str2);
        } else {
            System.out.println("Такой элемент уже присутствует");
        }
    }

    public void deleteElementByKey(String str) {
        if (map.containsKey(str)) {
            map.remove(str);
        }
    }
}