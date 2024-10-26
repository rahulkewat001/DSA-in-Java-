// import java.util.ArrayList;
// // import java.util.List;
import java.util.Arrays;



public class Practice {

    static void sorted(int[] arr) {
        
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    swap(arr,i, j);
                }
            }
        }
        
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        sorted(arr);
        System.out.println(Arrays.toString(arr));
    }
}
