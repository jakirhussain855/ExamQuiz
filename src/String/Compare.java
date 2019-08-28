package String;

public class Compare {
    public static void main(String[] args) {
        String value="peoplentech";
        String value2="peopl";
        String value3="PEOPLE";
        System.out.println(value.compareTo(value2));
        System.out.println(value.compareToIgnoreCase(value3));
//ends with and Starts with
        System.out.println(value.endsWith("h"));
        System.out.println(value.startsWith("h"));

        //REPLACES
        System.out.println((value.replace('n', '&')));
        System.out.println(value.replace('p','m'));
        //to upper-lower case
        System.out.println(value.toUpperCase());
    }
}
