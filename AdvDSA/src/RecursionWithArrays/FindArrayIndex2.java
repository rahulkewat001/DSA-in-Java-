package RecursionWithArrays;
import java.util.ArrayList;
public class FindArrayIndex2 {

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index ) {

        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length) {
            return list;
        }

        // this function contains answer for that call only
        if(arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 8};
        System.out.println(findAllIndex2(arr, 4, 0));
    }
}
