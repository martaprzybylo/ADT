package pl.sda.List;
import java.util.List;

public class QuickSort {
    public IList sort(IList<Integer> list2, int startIndex, int stopIndex) {
        if(startIndex >= stopIndex)
            return list2;
        int pivot = stopIndex;
        pivot = splitTable(pivot, list2, startIndex, stopIndex);
        sort(list2, startIndex, pivot-1);
        return sort(list2, pivot+1, stopIndex);
    }

    private int splitTable(int pivot, IList<Integer> list2, int startIndex, int stopIndex) {
        for(int i = startIndex; i < pivot; i++) {
            if(list2.get(i) >= list2.get(pivot)) {
                list2.add(pivot+1, list2.get(i));
                list2.remove(i);
                pivot--;
                i--;
            }
        }
        return pivot;
    }
}