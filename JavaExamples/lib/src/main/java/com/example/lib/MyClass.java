package com.example.lib;

import java.util.Arrays;

public class MyClass {
    // single line comment
    /* multiline comment */
    /**
     * documentation comment
     */


    public static void main(String[] args){
        // java output
        System.out.println("Hello my Friend!");

        // variable in java


        int age = 24;
        System.out.println("My age : "+age);

        // data types in java
        byte x = 127;  // -128 to 127
        short y = 32767;     //-32768 to 32767
        int z = 1213213223; // -2147483648 to 2147483647
        long a =1232343534678899999L; //

        float F = 3.14F;
        double D = 3.14;

        Boolean b = true;

        char c = 'A';
        char c1 = '7';
        char c2 = '!';


        // type casting
        int myNum = 9;
        double myDouble = myNum;
        System.out.println(myDouble);

        //implicit type casting
        int myDouble1 = 9;
        double myNum1 = myDouble1;
        System.out.println(myNum1);

        //explicit type casting
        double myDouble2 = 9.78d;
        int myNum2 = (int) myDouble2;
        System.out.println(myNum2);

        //type casting between different data types
        int myInt = 9;
        char myChar = (char) (myInt+'A');
        System.out.println(myChar);


        // operators in java +, -, *, /, %
        int a1 = 10;
        int b1 = 5;
        // add some text in concatenation
        System.out.println("************ Arithmetic Operators ***********");
        System.out.print("Sum of "+a1+" and "+b1+" is : ");
        // print the result
        System.out.println(a1+b1);
        System.out.print("Subtraction of "+a1+" and "+b1+" is :");
        System.out.println(a1-b1);
        System.out.print("Multiplication of "+a1+" and "+b1+" is :");
        System.out.println(a1*b1);
        System.out.print("Division of "+a1+" and "+b1+" is :");
        System.out.println(a1/b1);
        System.out.print("Remainder of "+a1+" and "+b1+" is :");
        System.out.println(a1%b1);
        System.out.println();


        // comparison operators ==, !=, >, <, >=, <=
        System.out.println("************ Comparison Operators *********** \n");
        System.out.print("a1 is equal to b1 :");
        System.out.println(a1==b1);
        System.out.print("a1 is not equal to b1 :");
        System.out.println(a1!=b1);
        System.out.print("a1 is greater than b1 :");
        System.out.println(a1>b1);
        System.out.print("a1 is less than b1 :");
        System.out.println(a1<b1);
        System.out.print("a1 is greater than or equal to b1 :");
        System.out.println(a1>=b1);
        System.out.print("a1 is less than or equal to b1 :");
        System.out.println(a1<=b1);
        System.out.println();

      //  logical operators &&, ||, !

        System.out.println("*********** Logical Operators *********** \n");
        System.out.print("a1 is greater than b1 and a1 is less than b1 :");
        System.out.println(a1>b1 && a1<b1);

        System.out.print("a1 is greater than b1 or a1 is less than b1 :");
        System.out.println(a1>b1 || a1<b1);


        System.out.print("a1 is not greater than b1 :");
        System.out.println(!(a1>b1));
        System.out.println();

        // String in java

        System.out.println("************* String *************\n");
        String name = "Neetu Singh";
        System.out.println("My Name is : "+name);
        System.out.println("My Name is : "+name.toUpperCase());
        System.out.println("My Name is : "+name.toLowerCase());
        System.out.println();

        // concatenation in java
        System.out.println("************* Concatenation *************\n");
        String firstName = "Neetu";
        String lastName = "Singh";
        System.out.println("Concatenation in java : "+firstName+" "+lastName);
        System.out.println();

        //String Length
        System.out.println("************* String Length *************\n");
        String str = "Hello World";
        System.out.println("String Lenght : "+str.length());
        System.out.println();

        //String methods

        System.out.println("************* String Methods *************\n");
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The first character is : "+txt.charAt(0));
        System.out.println("The last character is :"+ txt.charAt(txt.length()-1));
        System.out.println("The first 5 character is : "+txt.substring(0,5));
        System.out.println("The last 5 character is : "+txt.substring(txt.length()-5));
        System.out.println("The index of the character 'R' is : "+txt.indexOf('R'));
        System.out.println("The index of the first occurrence of the substring 'HI' is : "+txt.indexOf("HI"));
        System.out.println("The index of the last occurrence of the substring 'HI' is : "+txt.lastIndexOf("HI"));
        System.out.println("The string in upper case : "+txt.toUpperCase());
        System.out.println("The string in lower case : "+txt.toLowerCase());
        System.out.println();

        // String comparison

        System.out.println("************* String Comparison *************\n");
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";
        System.out.println("str1 == str2 : "+str1.equals(str2));
        System.out.println("str1 == str3 : "+str1.equals(str3));
        System.out.println("str1 == str2 : "+(str1==str2));
        System.out.println("str1 == str3 : "+(str1==str3));
        System.out.println();

        // if else statement
        System.out.println("************* If else Statement *************\n");
        int age1 = 22;
        if(age1 >= 18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
        System.out.println();

        // if else if statement
        System.out.println("************* If else if Statement *************\n");

        int age2 = 8;

        if(age2 >= 18){
            System.out.println("You are eligible to vote");
        }else if(age2 >= 13) {
            System.out.println("You are eligible to vote with a parent");
        }else {
            System.out.println("You are not eligible to vote");
        }
        System.out.println();

        // switch statement
        // why we use switch statement?
        // switch statement is used to select one of many code blocks to be executed
        // how it is different from if else statement?
        // switch statement is used to select one of many code blocks to be executed
        // if else statement is used to execute a block of code based on a condition
        System.out.println("************* Switch Statement ************* ");
        int day = 4;
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        //We need to create a conditional statement using a switch to check if "monthName" which is the variable that holds the month name , is a 31-days month or 30-days month.
        String monthName = "May";
        int no_of_days = 0;
        switch(monthName){
            case "January":
                no_of_days = 31;
                break;
            case "February":
                no_of_days = 28;
                break;
            case "March":
                no_of_days = 31;
                break;
            case "April":
                no_of_days = 30;
                break;
            case "May":
                no_of_days = 31;
                break;
            case "June":
                no_of_days = 30;
                break;
            case "July":
                no_of_days = 31;
                break;
            case "August":
                no_of_days = 31;
                break;
            case "September":
                no_of_days = 30;
                break;
            case "October":
                no_of_days = 31;
                break;
            case "November":
                no_of_days = 30;
                break;
            case "December":
                no_of_days = 31;
                break;
            default:
                System.out.println("Invalid month");

        }
        System.out.println("The number of days in "+monthName+" is "+no_of_days);
        System.out.println();


        // while loop
        //why we use while loop?
        // while loop is used to execute a block of code as long as a condition is true
        System.out.println("************* While Loop *************\n ");
        int i = 0;
        while(i<5) {
            System.out.println(i);
            i++;
        }
        System.out.println();

        // do while loop
        //why we use do while loop?
        // do while loop is used to execute a block of code once and then check the condition
        System.out.println("************* Do While Loop ************* \n");
        int j = 0;
        do{
            System.out.println(j);
            j++;
        }while(j<5);
        System.out.println();

        // for loop
        //why we use for loop?
        // for loop is used to execute a block of code a specific number of times
        System.out.println("************* For Loop ************* \n");
        for(int k=0; k<5; k++){
            System.out.println(k);
        }
        System.out.println();

        // break and continue statement
        System.out.println("************* Break and Continue Statement ************* \n");
        for(int l=0; l<10; l++){
            if(l==5){
                break;
            }
            System.out.println(l);
        }
        System.out.println();

        for(int m=0; m<10; m++){
            if(m==5){
                continue;
            }
            System.out.println(m);
            }
        System.out.println();


        //arrays
        // definition of arrays
        // arrays are used to store multiple values in a single variable
        System.out.println("************* Array ************* \n");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);
        System.out.println();

        //array length
        System.out.println("************* Array Length *************\n");
        System.out.println(cars.length);
        System.out.println();

        //array sort
        System.out.println("************* Array Sort ************* \n");
        String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
        Arrays.sort(cars1);

        for(String i1 : cars1){
            System.out.println(i1);
        }
        System.out.println();

        //array copy
        System.out.println("************* Array Copy ************* \n");
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        String[] cars3 = Arrays.copyOf(cars2, cars2.length);

        for(String i2 : cars3){
            System.out.println(i2);
        }
        System.out.println();

        // for each loop in java
        // why we use for each loop?
        // for each loop is used to iterate over an array
        System.out.println("************* For Each Loop ************* \n");
        String[] cars4 = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String i3 : cars4){
            System.out.println(i3);
            }
        System.out.println();


        // multidimensional array
        System.out.println("************* Multidimensional Array ************* \n");
        int [][] myMatrix = new int[3][3];
        myMatrix[0][0] = 1;
        myMatrix[0][1] = 2;
        myMatrix[0][2] = 3;
        myMatrix[1][0] = 4;
        myMatrix[1][1] = 5;
        myMatrix[1][2] = 6;
        myMatrix[2][0] = 7;
        myMatrix[2][1] = 8;
        myMatrix[2][2] = 9;

        for(int i1=0; i1<3; i1++){
            for(int j1=0; j1<3; j1++){
                System.out.print(myMatrix[i1][j1]+" ");
            }
            System.out.println();
        }

    }

}