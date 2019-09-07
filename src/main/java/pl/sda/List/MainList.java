package pl.sda.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainList {
    private static int upperBound = 10;
    private static long startTime;
    private static long startTime2;
    private static long stoptTime;
    private static long stoptTime2;

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        QuickSort qs = new QuickSort();
        Random random = new Random();

        IList list = new LinkedList<Integer>();
        for (int i = 0; i<=upperBound;i++){
            list.add(random.nextInt(upperBound));
        }

        startTime = System.nanoTime();
        System.out.println("Selection Sort Linked Listy");
        list = ss.selSort(list);
        Object[] tab = list.getHolderView();
        for (Object val:tab)
            System.out.print(val + " ");
        stoptTime = System.nanoTime();
        long runnungTime = stoptTime-startTime;
        System.out.println();

        startTime2 = System.nanoTime();
        System.out.println("Quick Sort Linked Listy");
        list = qs.sort(list, 0, list.size()-1);
        Object[] tab2 = list.getHolderView();
        for (Object val:tab2)
            System.out.print(val + " ");
        stoptTime2 = System.nanoTime();
        long runnungTime2 = stoptTime2-startTime2;
        System.out.println();

        System.out.println();
        System.out.println("Selection Sort Tablicy");
        int[] table = {16,4,9,8,12,2,5,0,6,3};
        int []sorted = ss.sort(table);
        for (int sor:sorted){
            System.out.print(sor + " ");
        }
        System.out.println();
        System.out.println("SS potrzebuje "+ runnungTime + " nanosekund");
        System.out.println("QS potrzebuje "+runnungTime2 + " nanosekund");

    }
}
