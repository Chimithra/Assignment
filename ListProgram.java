package com.company.Assesment;

import java.util.*;

public class ListProgram {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(20);
        l.add(10);
        l.add(40);
        l.add(15);
        l.add(20);
        Collections.sort(l);
        int first = l.get(0);
        int last = l.get(l.size()-1);
        System.out.println(l.toString());
        System.out.println(first);
        System.out.println(last);
    }
}
