import java.util.*;

public class Problem5_TrainPlatforms {

    public static int findMinPlatforms(int[] arrival, int[] departure) {
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int n = arrival.length;
        int platforms = 1;
        int maxPlatforms = 1;

        int i = 1, j = 0;

        while (i < n && j < n) {
            if (arrival[i] <= departure[j]) {
                platforms++;
                i++;
            } else {
                platforms--;
                j++;
            }
            maxPlatforms = Math.max(maxPlatforms, platforms);
        }

        return maxPlatforms;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of trains: ");
        int n = sc.nextInt();

        int[] arrival = new int[n];
        int[] departure = new int[n];

        System.out.println("Enter arrival and departure times (in HHMM format):");
        for (int i = 0; i < n; i++) {
            arrival[i] = sc.nextInt();
            departure[i] = sc.nextInt();
        }

        int result = findMinPlatforms(arrival, departure);
        System.out.println("Minimum number of platforms required: " + result);
    }
}
