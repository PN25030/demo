package com.example;

import javax.naming.InitialContext;
public class App 
{
    public static void main( String[] args )
    {
        //Single line comment
        System.out.println( "Hello World!" );
        /*Printing using print() function */
        System.out.print("Hello only print");
        System.out.println("Hello thrid");
        /*Printing numbers */
        System.out.println(21);

        // define variables
        int i = 15;
        String name = "XXX is a 'good' person";
        float percent = 9.03f;
        char intials = 'H';
        boolean is_flag = true;

        System.out.println(i+" "+name+" "+percent+" "+intials+" "+is_flag);

        System.out.println("Length is:"+name.length()+" Chars");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println("find IS:"+name.indexOf("is"));
        System.out.println(Math.abs(-100.7));
        System.out.println(Math.random());
        //short hand statement
        String sh = (percent > 8) ? "Passed" : "Failed";
        System.out.println(sh);
        //for loop
        for (i=1;i<10;i++) {
            System.out.println(i);
            for (int j=10; j<=20; j++){
                System.out.println("\t"+j);
            }
        }
    // for-each statement
    String[] cars = {"BMW", "Tesls", "Ford"};
    for (String k : cars){
        System.out.println(k);
    }
    }
}


