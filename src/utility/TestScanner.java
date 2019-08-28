package utility;

import java.util.Scanner;

public class TestScanner {
    public static int calculator() {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b=scanner.nextInt();

        int x = a + b;
        return x;
    }
    public static void studentInfo(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Insert name of astudent");
        String name=scanner.nextLine();
        System.out.println("insert age of a student");
        int age=scanner.nextInt();
        System.out.println("***moblie number");
        long mobileNum=scanner.nextLong();
        System.out.println("12211insert gendar of the student");
        char gender=scanner.next().charAt(0);
        System.out.println("Name is  : "+ name);
        System.out.println("Age is :"+ age);
        System.out.println("mobile number "+mobileNum);
        System.out.println("");
    }

    public static void main(String[] args) {
        int result=calculator();
        System.out.println();
    }

    }

