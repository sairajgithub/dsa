package com.practice.linkedlist;

import java.util.List;

public class Main {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("Sairaj");
        list.add("SDE3");
        list.add("at google");
        list.add("very soon");
        list.addFirst("Hello!!");
        list.remove(2);
        list.add("Is", 2);

        System.out.println("Head: "+list.head);
        System.out.println(list);

        List<String> jlist = new java.util.LinkedList<>();
        jlist.add("Sairaj");
        jlist.add("SDE3");
        jlist.add("at google");
        jlist.add("very soon");

        System.out.println(jlist);
    }
}
