package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayL {
    public static void main(String[] args) {

        ArrayList<Integer> listA = new ArrayList<Integer>();
        listA.add(2);
        listA.add(3);
        listA.add(4);
        listA.add(5);

        LinkedList<Integer> listB = new LinkedList<Integer>();
        listB.add(2);
        listB.add(3);
        listB.add(4);
        listB.add(5);

        for (Integer i : listA) {
            System.out.println(i);
        }

        for (Integer j : listB) {
            System.out.println(j);
        }
    }
}
