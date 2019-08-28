package conditions;

public class ExceptionHandling {
    public static void main(String[] args) {
        String[] name = {"Mr x", "Mr y", "Mr z", "Mr A"};
        //int []name={12,13,14};
        System.out.println(name[0]);
        System.out.println(name[1]);


        System.out.println(name[2]);

        // name.length =number of element
        //System.out.println(name.length);

        //try--leyword{--try block starts
        //finally --keyword--finally block always gets executed
        //mostly use for DB and file reading
        try {
            System.out.println(name[4]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            //we can write it other way catch
            // catch (Exception ex) {
            System.out.println("exception occoured");
            ex.printStackTrace();
            //ex.printStackTrace
        } finally {


        }
    }
}