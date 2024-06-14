
import java.util.Arrays;
public class practice {


    static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {18, 23, 3, 5, 34};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));


    }
}
