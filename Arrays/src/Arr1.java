public class Arr1 {

    public static int max(int arr[]){
        int maxVal = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
       int arr[] = {1,3,23,9,18};
        System.out.println(max(arr));
    }
}
