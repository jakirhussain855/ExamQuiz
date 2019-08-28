package practice;

import conditions.Loops;

public class TestMethod {
    public static void main(String[] args) {
        Method method=new Method();
        method.method1();
        String c=method.b;
        System.out.println(method.model);
        method.engine1="v8";
        System.out.println(method.engine1);
        method.engine2="v8";
        System.out.println("engine ="+ method.engine1);
        System.out.println("Engine ="+method.engine2);
        for(int i=0;i<3;i++) {
            System.out.println(method.engine1);
        }

        System.out.println(method.b);
        System.out.println(method.b);
        System.out.println(c);


    }
    }

