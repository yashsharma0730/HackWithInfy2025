import java.util.*;

public class Problem5_Buytwochocolates {

    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices); // Sort prices in ascending order
        if (prices[0] + prices[1] <= money) {
            return money - (prices[0] + prices[1]); // Buy two cheapest chocolates
        }
        return money; // Can't afford both
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter prices of chocolates:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.print("Enter amount of money: ");
        int money = sc.nextInt();

        int remainingMoney = buyChoco(prices, money);
        System.out.println("Remaining money: " + remainingMoney);
    }
}
