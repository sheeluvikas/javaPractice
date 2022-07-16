package coding.other;

public class TempDemo {

    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 4, 5, 7, 9};
        int[] arr2 = new int[] {3, 4, 6, 7, 11};

        int [] arr3 = new int[arr1.length + arr2.length];

        int i = 0; int j = 0; int k = 0;
        for (; i < arr1.length && j < arr2.length; k++){
            if(arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }
            else if(arr1[i] > arr2[j]){
                arr3[k] = arr2[j];
                j++;
            }
            else {
                arr3[k] = arr1[i];
                i++; j++;
            }
        }
        if(i < arr1.length){
            for(; i < arr1.length; ){
                arr3[k] = arr1[i];
                i++;
            }
        }
        if(j < arr2.length){
            for(; j < arr2.length; ){
                arr3[k] = arr2[j];
                j++;
            }
        }

        for(int m = 0; m <= k; m++){
            System.out.print(arr3[m] + " ");
        }
    }
}
