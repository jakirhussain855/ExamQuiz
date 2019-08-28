package conditions;


public class TestCondition {
    //psvm
    public static void main(String[] args) {
        int x = 11;
        if (x > 10) {
            System.out.println("x is greater then 10");
        } else if (x < 10) {
            System.out.println("x is less then ");
        } else if (x == 10) {
            System.out.println("x =10");
        } else if (x == 0) {
            System.out.println("x is something else");
        }
        if (x < 10) System.out.println("x is less then10");
        System.out.println("**************************");
        int a = 4;

        if (a > 3) {
            System.out.println("a is greater then 3");
        } else {
            System.out.println("a is less 3");
        }
        System.out.println("#*#*#*#*");
        int b = 7;
        if (b > 5 && b > 4) {
            System.out.println("b is greater 5");
        } else if (b == 5 | b == 4) {
            System.out.println("b is equal 5");
        } else if (b < 5 && b != 3) {
            System.out.println("b is less 5");
        }
        System.out.println("@@@@@@@@@");
        //if else
        // | or button && and button   ! not button

        int s = 9;
        int t = 10;
        if (s > 10 && t < 12) {
            System.out.println("we won");
        } else if (s == 12 | t == 12) {
            System.out.println("we lost");
        } else if (s != 12) {
            System.out.println("nothing");
        }

        }


    }


