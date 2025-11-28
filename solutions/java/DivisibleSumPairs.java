import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    // Write your code here
        int pairs = 0, sum;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = ar.get(i) + ar.get(j);
                if (sum % k == 0) {
                    pairs++;
                }
            }
        }
        return pairs;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int x = 0; x < n; x++) {
            int arItem = Integer.parseInt(arTemp[x]);
            ar.add(arItem);
        }

        int result = Result.divisibleSumPairs(n, k, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
