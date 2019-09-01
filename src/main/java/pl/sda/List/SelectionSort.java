package pl.sda.List;

public class SelectionSort {

    public IList selSort(IList<Integer> listToSort){
        int firstUsortedIndex = 0;

        do {
            int minIndex = findMinValueIndex(listToSort, firstUsortedIndex);
            int tmp = listToSort.get(minIndex);
            listToSort.set(minIndex, listToSort.get(firstUsortedIndex));
            listToSort.set(firstUsortedIndex, tmp);
        }while (++firstUsortedIndex!=listToSort.size());
        return listToSort;
    }

    private int findMinValueIndex(IList<Integer> list, int startIndex) {
        int minValue = list.get(startIndex);
        int minValueIndex = startIndex;

        for (int i = startIndex+1; i<list.size(); i++){
            if (list.get(i)<minValue){
                minValue = list.get(i);
                minValueIndex = i;
            }
        } return minValueIndex;
    }

    public int[] sort(int[] tableToSort) {
        int firstUsortedIndex = 0;

        do {
            int minIndex = findMinValueIndex(tableToSort, firstUsortedIndex);
            int tmp = tableToSort[minIndex];
            tableToSort[minIndex] = tableToSort[firstUsortedIndex];
            tableToSort[firstUsortedIndex] = tmp;
        }while (++firstUsortedIndex!=tableToSort.length);
            return tableToSort;
    }

    private int findMinValueIndex(int[] table, int startIndex) {
        int minValue = table[startIndex];
        int minValueIndex = startIndex;

        for (int i = startIndex+1; i<table.length; i++){
            if (table[i]<minValue){
                minValue = table[i];
                minValueIndex = i;
            }
        } return minValueIndex;
    }


}

