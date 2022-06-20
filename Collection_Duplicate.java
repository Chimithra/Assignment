package com.company.Assesment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class Collection_Duplicate {
    public static void main(String[] args) throws IOException {
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of linkedList...");
        n = Integer.parseInt(br.readLine());
        LinkedList<String> linkedList = new LinkedList <>();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the element...");
            String str = br.readLine();
            if(linkedList.contains(str)==true)
            {
                System.out.println("The element is already existing...");
                i--;
            }
            else
                linkedList.add(str);
        }
        Iterator<String> it = linkedList.iterator();
        System.out.println("Contents of Linked List using iterator...");
        while(it.hasNext())
            System.out.println("\t" + it.next());
        System.out.println("Enter the element to search : ");
        String search = br.readLine();
        int position = linkedList.indexOf(search);
        if(position == -1)
            System.out.println(" The element not found" );
        else
            System.out.println(" The element found at location :  " +position);
    }

}
