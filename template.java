import java.io.*;
import java.util.*;

class Solution {
    static final FastScanner fs = new FastScanner();
    static int testCases;

    public static void main(String[] args) {
        testCases = fs.nextInt();
        while (testCases-- > 0) {
            solve();
        }
    }

    public static void solve() {
        //write code here
    }

    static final Random random = new Random();

    public static void ruffleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; ++i) {
            int oi = random.nextInt(n), temp = a[oi];
        }
        Arrays.sort(a);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {}
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
