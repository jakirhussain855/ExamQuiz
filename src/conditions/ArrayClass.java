package conditions;

public class ArrayClass {
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
            int s = 0;
            do {
                System.out.println("i love java");
                s++;
            }
            while (s < 5);

        }
    }


