package dataStructure1;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice2 {

    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("NY");
        arrayList.add("NJ");
        arrayList.add("VA");
        //System.out.println(arrayList.get(0));
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i) + " ");

        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) ;
        System.out.println(it.next());

    }

}
