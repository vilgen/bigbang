public class LinearSearch {

        public static void main(String[] args) {
                int[] arr = {1, 2, 23, 234, -2324, 33};
                System.out.println(countEvenNumberOfDigitsOfArr(arr));

        }

        /* Given an array of nums of integers, return how many
        * of them contain an even number of digits*/
        static int countEvenNumberOfDigitsOfArr(int[] arr) {

                int result = 0;
                for (int element : arr) {

                        if(countDigits(element)%2 == 0) {
                                result++;
                        }
                }

                return result;

        }

        static int countDigits(int number) {
                if(number < 0) {
                        number *= -1;
                }
                if(number == 0) {
                        return 1;
                }
                int count = 0;
                while(number>0) {
                        count++;
                        number /= 10;
                }

                return count;
        }

}
