package com.company.Assesment;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Stringtokenizer {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>();
        StringTokenizer str = new StringTokenizer("I am Learning Full Stack", " ", true);
        while(str.hasMoreElements()){
            t.add(str.nextToken());
        }
        System.out.println(t);
    }
}
