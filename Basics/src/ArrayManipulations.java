import java.util.Arrays;

public class ArrayManipulations {

        public static void main(String[] args) {
                int[] arr = {1, 3, 19, 23, 443, 555, 4};
                //swap(arr, 3,5);
                reverse(arr);
                System.out.println(Arrays.toString(arr));

                System.out.println(maxValue(arr));
        }
        static void reverse(int[] arr) {
                int left = 0;
                int right = arr.length-1;

                while(left<right) {
                        swap(arr, left, right);
                        left++;
                        right--;
                }
        }
        static void swap(int[] arr, int i, int j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
        }

        static int maxValue(int[] arr) {
                int max = Integer.MIN_VALUE;
                for (int val: arr) {
                        if(val > max) {
                                max=val;
                        }
                }
                return max;
        }

}
