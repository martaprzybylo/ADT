package pl.sda.List;

public class MainList {

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();

        IList list = new LinkedList<Integer>();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(0);
        list.add(9);

        list = ss.sort(list);

        Object[] tab = list.getHolderView();

        for (Object val:tab)
            System.out.print(val + " ");

        System.out.println();

        int[] table = {16,4,9,8,12,2,5,0,6,3};

        int []sorted = ss.sort(table);
        for (int sor:sorted){
            System.out.print(sor + " ");
        }

    }
}
