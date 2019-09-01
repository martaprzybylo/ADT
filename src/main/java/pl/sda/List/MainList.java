package pl.sda.List;

public class MainList {

    public static void main(String[] args) {
        IList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        Object[] tab = list.getHolderView();

        for (Object val:tab)
            System.out.print(val + " ");

        System.out.println();

        int[] table = {16,4,9,8,12,2,5,0,6,3};
        SelectionSort ss = new SelectionSort();
        int []sorted = ss.sort(table);
        for (int sor:sorted){
            System.out.print(sor + " ");
        }

    }
}
