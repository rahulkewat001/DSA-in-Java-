package BinearySearchIn2D;

public class SortedMatrix {
    public static void main(String[] args) {

    }

    // search int the rows provided btw the col. provided
    static int[] binarySearch(int[][] matrix, int r, int c, int cStart, int cEnd, int target) {
        while(cStart <= cEnd) {
            int m = cStart + (cEnd - cStart) / 2;
            if(matrix[r][m] == target) {
                return new int[]{r, m};
            }
            if(matrix[r][m] < target) {
                cStart = m + 1;
            } else {
                cEnd = m - 1;
            }
        }
        return new int[]{-1, -1};
    }

//    static int[] search(int[][] matrix, int target) {
//        int r = matrix.length;
//        int c = matrix[0].length; // be cautious, matrix may be empty
//
//        if(r == 1) {
////            return binarySearch(matrix, 0, 0, c-1, target);
//        }
//
//        int rStart = 0;
//        int rEnd = r - 1;
//        int cMid = c / 2;
//
//    // run the loop till 2 rows are remaining
//
//    }
}
