import java.util.Arrays;

public class Problem7_DI_Stringmatch {

    public static int[] diStringMatch(String s) {
        int n = s.length();
        int[] ans = new int[n + 1];

        int iCount = 0;
        int dCount = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                ans[i] = iCount++;
            } else {
                ans[i] = dCount--;
            }
        }

        ans[n] = iCount;

        return ans;
    }

    public static void main(String[] args) {
        String s = "IDID";

        int[] result = diStringMatch(s);

        System.out.println("Output: " + Arrays.toString(result));
    }
}
