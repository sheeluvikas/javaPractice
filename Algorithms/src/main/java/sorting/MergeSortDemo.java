package sorting;

import com.utils.ArrayUtils;

/**
 * Merge Sorting
 *
 * has the complexity of n log n
 * https://www.interviewbit.com/tutorial/merge-sort-algorithm/
 *
 * */
public class MergeSortDemo {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();

        Integer [] arr = {1, 4, 3,25, 6, 5, 43, 22, 65, 76, 34, 53, 22, 32};

        mergeSort(arr, arr.length);
        arrayUtils.printArray(arr);
    }


    public static void mergeSort(Integer [] arr,  int n){

    }

}
