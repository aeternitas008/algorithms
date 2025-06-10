package tink_0125;
import java.util.Scanner;
public class Two {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int countDays = sc.nextInt();
            long[] arr = new long[countDays];
            for (int i = 0; i < countDays; ++i) {
                arr[i] = findLargestWithThreeOnes(sc.nextLong());
                System.out.println(arr[i]);
            }
        }
    }

    public static long findLargestWithThreeOnes(long n) {
        for (long i = n; i >= 0; i--) {
            if (Long.bitCount(i) == 3) {
                return i;
            }
        }
        return -1;
    }
}