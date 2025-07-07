import java.util.*;

public class Problem2_ActivitySelection {

    static class Activity {
        int start, end;

        Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static int maxActivities(List<Activity> activities) {
        activities.sort(Comparator.comparingInt(a -> a.end));

        int count = 0;
        int lastEndTime = -1;

        for (Activity activity : activities) {
            if (activity.start >= lastEndTime) {
                count++;
                lastEndTime = activity.end;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of activities: ");
        int n = sc.nextInt();

        List<Activity> activities = new ArrayList<>();

        System.out.println("Enter start and end time of each activity:");
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            activities.add(new Activity(start, end));
        }

        int result = maxActivities(activities);
        System.out.println("Maximum number of non-overlapping activities: " + result);
    }
}
