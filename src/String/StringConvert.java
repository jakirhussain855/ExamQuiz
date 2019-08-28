package String;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StringConvert {
    public static void main(String[] args) {
        String a = "10";
        Integer b = Integer.valueOf(a);
        System.out.println(b);

        int c = Integer.parseInt(a);
        System.out.println(c);
        String x = "12A";
        //HOMEWORK
        //string to decimal
        // String to boolean
        //same with flooat....Boolean.valueof
        //
        try {
            Integer y = Integer.valueOf(x);
            System.out.println(y);
        } catch (NumberFormatException ee) {
            System.out.println("NumberformatWxceptionOccoured");
            ee.printStackTrace();
        }

    }
}