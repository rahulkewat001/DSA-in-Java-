package RecursionWithArrays;

public class LinearSearch {

    static boolean search(int[] arr, int target, int index) {
        if(index == arr.length) {
            return false;
        }
        return arr[index] == target || search(arr, target, index+1);
    }

    static int find(int[] arr, int target, int index) {
        if(index == arr.length) {
            return -1;
        }
        if(arr[index] == target) {
            return index;
        } else {
            return find(arr, target, index+1);
        }

     }

    static int findIndexLast(int[] arr, int target, int index) {
        if(index == -1) {
            return -1;
        }
        if(arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index-1);
        }

    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9};
        System.out.println(search(arr, 2, 0));
        System.out.println(find(arr, 1, 0));
        System.out.println(findIndexLast(arr, 9, 0));
    }
}
