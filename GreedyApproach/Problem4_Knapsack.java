import java.util.*;

public class Problem4_Knapsack {

    static class Item {
        int value, weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }
    public static double getMaxValue(int W, Item[] items) {
        Arrays.sort(items, (a, b) -> {
            double r1 = (double) a.value / a.weight;
            double r2 = (double) b.value / b.weight;
            return Double.compare(r2, r1);
        });

        double totalValue = 0.0;

        for (Item item : items) {
            if (W == 0) break;

            if (item.weight <= W) {
                totalValue += item.value;
                W -= item.weight;
            } else {
                totalValue += item.value * ((double) W / item.weight);
                break;
            }
        }

        return totalValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int W = sc.nextInt();
        int n = sc.nextInt();

        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            int weight = sc.nextInt();
            items[i] = new Item(value, weight);
        }

        double maxValue = getMaxValue(W, items);
        System.out.printf("%.2f\n", maxValue);
    }
}
