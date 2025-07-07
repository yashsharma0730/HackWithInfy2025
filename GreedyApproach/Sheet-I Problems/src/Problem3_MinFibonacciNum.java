import java.util.*;

public class Problem3_MinFibonacciNum {

    public static int findMinFibonacciNumbers(int k) {
        List<Integer> fibs = new ArrayList<>();
        fibs.add(1);
        fibs.add(1);
        while (true) {
            int next = fibs.get(fibs.size() - 1) + fibs.get(fibs.size() - 2);
            if (next > k) break;
            fibs.add(next);
        }
        int count = 0;
        for (int i = fibs.size() - 1; i >= 0 && k > 0; i--) {
            if (fibs.get(i) <= k) {
                k -= fibs.get(i);
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int result = findMinFibonacciNumbers(k);
        System.out.println("Minimum number of Fibonacci numbers: " + result);

        sc.close();
    }
}
