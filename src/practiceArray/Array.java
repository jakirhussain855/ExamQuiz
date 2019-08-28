package practiceArray;

public class Array {
    public static void main(String[] args) {
        String[] a = {"this is very importent", "but depents on how you want to execute", "retuen 0 if it " +
                "is not valid",};
        System.out.println(a[0]);
        int[] b = {12, 20, 21};
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " " + a[i] + " " + i + "dont give up practice as much as u can ");
        }
        for (int s : b) {
            System.out.println(s);
        }
        try {
            System.out.println(a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("exception occour");
            e.printStackTrace();
        }
        finally {

        }
    }
}
