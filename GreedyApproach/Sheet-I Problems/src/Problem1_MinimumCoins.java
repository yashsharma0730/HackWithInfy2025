import java.util.Arrays;
import java.util.Scanner;

public class Problem1_MinimumCoins {
    public static int greedyMinCoins(int[] coins, int amount) {
        Arrays.sort(coins); // Ascending sort
        int n = coins.length;
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (coins[i] <= amount) {
                int take = amount / coins[i];
                count += take;
                amount -= take * coins[i];
            }
        }

        return (amount == 0) ? count : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of coin types: ");
        int n = sc.nextInt();

        int[] coins = new int[n];

        System.out.print("Enter the coin denominations: ");
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        System.out.print("Enter the target amount: ");
        int amount = sc.nextInt();

        int result = greedyMinCoins(coins, amount);

        if (result == -1) {
            System.out.println("Not possible to make the given amount using greedy approach.");
        } else {
            System.out.println("Minimum coins needed: " + result);
        }
        sc.close();
    }
}
