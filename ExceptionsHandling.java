package com.company.Assesment;

public class ExceptionsHandling {
    public static void main(String[] args) {
        try{
            int a = 10 / 0;
            System.out.println("Exception will occur");
        }
        catch(Exception e){
            System.out.println("Super Class Exception");
        }
        /*catch(ArithmeticException e){
            System.out.println("It will give compile error because Exception handled in superclass");
        }*/
    }
}
