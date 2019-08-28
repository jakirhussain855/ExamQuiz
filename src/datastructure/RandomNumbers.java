package datastructure;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
      int [] studentId = new int[5];

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int newvalue = random.nextInt(100);
            studentId[i] = newvalue;
            System.out.println(newvalue);
        }
        System.out.println(random.nextInt(100));

    }
}