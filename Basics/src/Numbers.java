import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Numbers {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                //System.out.println(nthFibonacciNumber(n));
                //System.out.println(isPrime(n));
                //System.out.println(isPrimeOptimised(n));
                //System.out.println(maxOccurrences(n));
                //System.out.println(reverseInteger(n));
                //System.out.println(factorial(n));

        }

        static int nthFibonacciNumber(int n) {

                int a = 0;
                int b = 1;
                int count = 2;

                while(count <= n) {
                        int tmp = b;
                        b = b + a;
                        a = tmp;
                        count++;
                }

                return b;
        }

        static boolean isPrime(int n) {

                if(n <= 1) {
                        return false;
                }

                for (int i = 2; i < n; i++) {
                        if(n%i == 0) {
                                return false;
                        }
                }
                return true;
        }

        static boolean isPrimeOptimised(int n) {

                if(n <= 1) {
                        return false;
                }
                int c = 2;
                while(c*c<=n) {
                        if(n%c == 0) {
                                return false;
                        }
                        c++;
                }
                return true;
        }

        static int factorial(int n) {
                int result = 1;

                for (int i = 2; i <= n; i++) {
                        result *= i;
                }

                return result;
        }

        /* n = 1385757879*/
        static int maxOccurrences(int n) {
                int result = 0;
                Map<Integer, Integer> countMap = new HashMap<>();
                while(n>0) {
                        int rem = n%10;
                        countMap.put(rem, countMap.getOrDefault(rem, 0)+1);
                        n = n/10;
                }

                for(Entry<Integer, Integer> entry: countMap.entrySet()) {
                        if(entry.getValue() > result) {
                                result = entry.getValue();
                        }
                }

                return result;
        }

        static int reverseInteger(int n) {
                int result = 0;
                while(n>0) {
                        int rem = n%10;
                        n = n/10;
                        result = result*10 + rem;
                }

                return result;
        }
}
