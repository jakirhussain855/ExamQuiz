package datastructure;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("mr.x");
        arrayList.add("mr. z");
        System.out.println(arrayList.get(0));
        for(int i=0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));

        }
        arrayList.remove(1) ;
           for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
