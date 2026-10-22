import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = { 10, 4, 2, 45, 65, 2, 1, 55, 35};

        mergeSort(arr, 0, arr.length -1);

        for(int val : arr){
            System.out.print(val +" ");
        }
    }
    static void mergeSort(int [] arr, int start, int end){
        if(start < end){
            int mid = start + ( end - start) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid +1, end);

            merge(arr, start, mid , end);
        }
    }

    static void merge(int [] arr, int start, int mid, int end){
        int i = start;
        int j = mid + 1;

        List<Integer> list = new ArrayList<>();
            
        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                list.add(arr[i++]);
            }else{
                list.add(arr[j++]);
            }
        }

        while(i <= mid){
            list.add(arr[i++]);
        }
        while(j <= end){
            list.add(arr[j++]);
        }

        int idx = 0;
        for(int k = start; k<=end; k++){
            arr[k] = list.get(idx++);
        }
    }
}
