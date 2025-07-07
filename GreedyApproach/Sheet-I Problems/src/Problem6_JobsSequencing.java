import java.util.*;

public class Problem6_JobsSequencing {

    static class Job {
        int deadline, profit;

        Job(int deadline, int profit) {
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of jobs: ");
        int n = sc.nextInt();

        Job[] jobs = new Job[n];
        System.out.println("Enter deadline and profit for each job:");
        for (int i = 0; i < n; i++) {
            int deadline = sc.nextInt();
            int profit = sc.nextInt();
            jobs[i] = new Job(deadline, profit);
        }

        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        boolean[] slot = new boolean[maxDeadline + 1];

        int jobCount = 0, totalProfit = 0;

        for (Job job : jobs) {
            for (int j = job.deadline; j >= 1; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    jobCount++;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        System.out.println("Number of jobs scheduled: " + jobCount);
        System.out.println("Total profit: " + totalProfit);
    }
}
