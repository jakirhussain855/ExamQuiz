package datastructure;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

public class ArrayPractice {
    public static void main(String[] args) {

        //Array--[]
        String[] name = {"Mr x", "Mr y", "Mr z", "Mr w"};
        name[0] = "Mr jamil";
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        // name.length =number of element
        System.out.println(name.length);
        for (int a = 0; a < 2; a++) {
            System.out.println(name[a]);
            System.out.println("************");
        }
        for (int b = 0; b < name.length; b++) {
            System.out.println(name[b]);
        }
        int[] numbers = {12, 11, 111, 223, 322};
        Object[] objectArray = {1, "Mr B", 1};
        for (int a = 0; a < objectArray.length; a++) {
            System.out.println(objectArray[a]);
            System.out.println("******");
        }
        //inner for loop
        //print selenium 5 times,and each time u print selenium,print java 2 times

        for (int i = 0; i < 5; i++) {
            System.out.println("Selenium");

            for (int z = 0; z < 2; z++) {
                System.out.println("Java");
            }
        }   //enchanced loop
        System.out.println("******");
        int[] id = {12, 11, 111, 223, 322};
        for (int s : id) {
            System.out.println(s);
        }
        System.out.println("******");
        //DO WHILE LOOP'''''
       // int s = 0;
       // do {
        //    System.out.println("i love java");
         //   s++;
        //}
        //while (s < 5);


        System.out.println("*******");
        int[] number=new int[13];
        number [0]=11;
        number[1]=12;
        number[2]=13;
        System.out.println((number.length));
        System.out.println(number[2]);
        int [] newArray=number.clone();
        System.out.println(newArray.length);
        System.out.println(newArray[2]);


        String[] nam=new String [3];
             nam [0]="lets practice";
           nam[1]="data structure";
        nam[2]="Array practice";
               System.out.println((nam.length));
            System.out.println(nam[2]);
                //nam[] oldArray=nam.clone();
               // System.out.println(newArray.length);
        //        System.out.println(newArray[2]);


    }
}