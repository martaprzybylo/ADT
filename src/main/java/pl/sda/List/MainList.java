package pl.sda.List;

import java.util.ArrayList;
import java.util.List;

public class MainList {

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        QuickSort qs = new QuickSort();

        IList list = new LinkedList<Integer>();
        list.add(57);
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(0);
        list.add(4);
        list.add(12);
        list.add(9);
        list.add(5);

        System.out.println("Selection Sort Linked Listy");
        list = ss.selSort(list);
        System.out.println();
        System.out.println("Quick Sort Linked Listy");
        list = qs.sort(list, 0, list.size()-1);


        Object[] tab = list.getHolderView();

        for (Object val:tab)
            System.out.print(val + " ");

        System.out.println();
        System.out.println("Selection Sort Tablicy");

        int[] table = {16,4,9,8,12,2,5,0,6,3};

        int []sorted = ss.sort(table);
        for (int sor:sorted){
            System.out.print(sor + " ");
        }

    }
}
