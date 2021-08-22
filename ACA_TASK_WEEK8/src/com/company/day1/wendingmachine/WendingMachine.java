package com.company.day1.wendingmachine;

import java.util.HashMap;
import java.util.LinkedList;

public class WendingMachine {

    public HashMap<String,LinkedList[]>  hMap()
    {
        LinkedList<Object>[] list1=new LinkedList[3];
        list1[0]=new LinkedList<>();
        list1[0].add(new Cola());
        HashMap<String,LinkedList[]> hashMap=new HashMap<>();
        hashMap.put("A",list1);
        return hashMap;
    }
}
