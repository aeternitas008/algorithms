package tink_0125;
import java.util.Arrays;
import java.util.Scanner;
public class Three {
    public static void main(String args[]) {
        int n;
        int m;
        int k;
        int x;
        int[] arr;
        int goodDays;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextInt();
            x = sc.nextInt();
            arr = new int[n - 2];
            for (int i = 0; i < n - 2; ++i) {
                arr[i] = sc.nextInt();
            }
        }
        int countChanges = 0;
        Arrays.sort(arr);
        int index1 = n - 1;
        int index2 = 0;
        for (int i = 0; i < n - 2; ++i) {
            if (arr[i] <= x) {
                index2 = i;
            }
        }
        for (int i = n - 3; i >= 0; --i) {
            if (arr[i] >= k) {
                index1 = i;
            }
        }
        goodDays = index2 - index1;
        while (goodDays < m) {
            if (index1 > 0 && k - arr[index1 - 1] < arr[index2 + 1] - x) {
                --index1;
                goodDays += 1;
                countChanges += k - arr[index1];
            } else if (index2 < n - 3) {
                index2++;
                goodDays += 1;
                countChanges += arr[index2] - x;
            }
        }
        System.out.println(countChanges);
    }
}