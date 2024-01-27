public class BinarySearch {

        public static void main(String[] args) {
                int[] arr = {2, 6, 12, 24, 27, 29, 33, 36, 48};
                System.out.println(findTheTargetInAscOrderedArray(arr, 48));

                int[] arr2 = {59, 45, 42, 33, 29, 22, 16, 8, 4, 2};
                System.out.println(findTheTargetInDescOrderedArray(arr2, 33));

                int[] arr3 = {59, 45, 42, 33, 29, 22, 16, 8, 4, 2};
                System.out.println(findTheCeilingTargetInDescOrderedArray(arr3, 0));

                int[] arr4 = {2, 6, 12, 24, 27, 29, 33, 36, 48};
                System.out.println(findTheCeilingTargetInAscOrderedArray(arr4, 10));

                int[][] matrix = {{1}};
                System.out.println(findTheTargetIn2DArray(matrix, 1));
        }

        static int findTheTargetInAscOrderedArray(int[] arr, int target) {
                int start = 0;
                int end = arr.length-1;

                while(start <= end) {
                        int middle = start + (end - start) / 2;

                        if(target < arr[middle]) {
                                end = middle-1;
                        }
                        else if (target > arr[middle]) {
                                start = middle+1;
                        }
                        else {
                                return middle;
                        }
                }

                return -1;
        }

        static int findTheTargetInDescOrderedArray(int[] arr, int target) {
                int start = 0;
                int end = arr.length-1;

                while(start <= end) {
                        int middle = start + (end - start) / 2;

                        if(target > arr[middle]) {
                                end = middle-1;
                        }
                        else if (target < arr[middle]) {
                                start = middle+1;
                        }
                        else {
                                return middle;
                        }
                }

                return -1;
        }

        /* Ceiling number in the desc sorted array is equals or greater the target*/
        static int findTheCeilingTargetInDescOrderedArray(int[] arr, int target) {
                int start = 0;
                int end = arr.length-1;

                while(start <= end) {
                        int middle = start + (end - start) / 2;

                        if(target > arr[middle]) {
                                end = middle-1;
                        }
                        else if (target < arr[middle]) {
                                start = middle+1;
                        }
                        else {
                                return middle;
                        }
                }

                return end;
        }

        /* Ceiling number in the asc sorted array is equals or greater the target*/
        static int findTheCeilingTargetInAscOrderedArray(int[] arr, int target) {
                int start = 0;
                int end = arr.length-1;

                while(start <= end) {
                        int middle = start + (end - start) / 2;

                        if(target < arr[middle]) {
                                end = middle-1;
                        }
                        else if (target > arr[middle]) {
                                start = middle+1;
                        }
                        else {
                                return middle;
                        }
                }

                return start;
        }

        /* find the target in 2D array*/
        static boolean findTheTargetIn2DArray(int[][] matrix, int target) {
                for(int m=0; m<matrix.length; m++) {

                        int start = 0, end = matrix[m].length-1;

                        while(start <= end) {
                                int middle = start + (end-start)/2;

                                if(target > matrix[m][middle]) {
                                        start = middle+1;
                                }
                                else if(target < matrix[m][middle]) {
                                        end = middle-1;
                                }
                                else {
                                        return true;
                                }
                        }
                }

                return false;
        }
}
