import java.util.*;

public class Problem7_CarRefueling {

    static class Station {
        int position, fuel;

        Station(int position, int fuel) {
            this.position = position;
            this.fuel = fuel;
        }
    }

    public static int minRefuelStops(int target, int startFuel, List<Station> stations) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int refuels = 0, i = 0, n = stations.size();
        int currentFuel = startFuel;

        while (currentFuel < target) {
            while (i < n && stations.get(i).position <= currentFuel) {
                maxHeap.add(stations.get(i).fuel);
                i++;
            }

            if (maxHeap.isEmpty()) return -1; // No reachable station left

            currentFuel += maxHeap.poll(); // Refuel with max available fuel
            refuels++;
        }

        return refuels;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target distance: ");
        int target = sc.nextInt();

        System.out.print("Enter initial fuel: ");
        int startFuel = sc.nextInt();

        System.out.print("Enter number of stations: ");
        int n = sc.nextInt();

        List<Station> stations = new ArrayList<>();
        System.out.println("Enter station positions and fuel:");
        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt();
            int fuel = sc.nextInt();
            stations.add(new Station(pos, fuel));
        }

        int result = minRefuelStops(target, startFuel, stations);
        System.out.println("Minimum number of refuels: " + result);
    }
}
