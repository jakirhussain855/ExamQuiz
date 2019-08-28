package String;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StringConcatenate {
    public static void main(String[] args) {


        String a = "people";
        String b = "and";
        String c = "tech";
        System.out.println(a + b + c);

        String x = "rock";
        String y = "star";
        String z = x.concat(y);

        System.out.println(z);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("rock");
        stringBuilder.append("star");
        System.out.println(stringBuilder);
        StringBuilder stringBuilder2 = new StringBuilder();
        //String numbers="";
        for (int i = 0; i < 5; i++) {
            stringBuilder2.append(i);
        }
        System.out.println(stringBuilder2);


        String numbers = " ";
        for (int i = 0; i < 5; i++) {

            numbers = numbers + i;

        }
        System.out.println(numbers);
    }
}