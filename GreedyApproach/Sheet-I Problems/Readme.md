# Problem 1: Minimum Coins (Greedy Approach)

## 📌 Problem Statement

You are given an array `coins[]`, where each element represents a coin of a different denomination. You are also given a target value `amount`. You have **unlimited supply of each coin**.

Your task is to determine the **minimum number of coins needed** to obtain the target sum **using a greedy approach**. If it is not possible to form the sum using the given coins, return `-1`.

📎 **LeetCode:** [Coin Change 2](https://leetcode.com/problems/coin-change-2/)  
📺 **YouTube:** [Abdul Bari](https://www.youtube.com/watch?v=GafjS0FfAC0), [GeeksforGeeks](https://www.youtube.com/watch?v=8LusJS5-AGo)

##  Approach: Greedy Algorithm

1. Sort the coin denominations in **descending order**.
2. At each step, pick the **largest coin** that does not exceed the remaining amount.
3. Subtract its value and increment the coin count.
4. Repeat until the amount becomes zero or no coin can be picked.
5. If the remaining amount is not zero, return `-1` indicating it's not possible.

---

##  Input Format

- First line: An integer `n` representing the number of coin types.
- Second line: `n` space-separated integers representing the coin denominations.
- Third line: An integer `amount` representing the target sum.

### Example:
Enter number of coin types: 4

Enter the coin denominations: 10 5 2 1

Enter the target amount: 43

Minimum coins needed: 6


# Problem 2: Activity Selection (Greedy Algorithm)

## 📌 Problem Statement

You are given `n` activities with their **start and end times**. The goal is to **select the maximum number of non-overlapping activities** such that no two selected activities overlap in time.

Activities must be selected based on **earliest finishing time**, which ensures maximum compatibility.

---
📎 **LeetCode:** [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/), [Maximum Events](https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/)  
📺 **YouTube:** [GeeksforGeeks](https://www.youtube.com/watch?v=QuesAUViVw8), [take U forward](https://www.youtube.com/watch?v=LWvN1m7tTDU)

##  Constraints

- 1 ≤ n ≤ 10⁴
- 0 ≤ startᵢ < endᵢ ≤ 10⁶

---

##  Greedy Approach

1. **Sort** all activities by their **ending time** in ascending order.
2. Select the first activity.
3. For each subsequent activity:
    - If the **start time** is greater than or equal to the **end time** of the last selected activity, select it.
4. Continue this process until all activities are checked.

This greedy strategy guarantees the maximum number of non-overlapping activities.

---

##  Input Format

- First line: Integer `n` – the number of activities.
- Next `n` lines: Each line contains two integers – `startᵢ` and `endᵢ`.

### Example:
Enter number of activities: 6
Enter start and end time of each activity:

1 2

3 4

0 6

5 7

8 9

5 9

Maximum number of non-overlapping activities: 4


#  Problem 3: Minimum Number of Fibonacci Numbers Whose Sum is K

##  Problem Statement

Given an integer `k`, return the **minimum number of Fibonacci numbers** whose sum is equal to `k`.

Each Fibonacci number can be used **at most once**.

---
📎 **LeetCode:** [1414. Minimum Fibonacci Numbers](https://leetcode.com/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k/)  
📺 **YouTube:** [Leetcode Solution](https://www.youtube.com/watch?v=1RJOc3AQV9E?si=No674A1MSb2SJfhg)

## Greedy Approach

At each step:
- Choose the **largest Fibonacci number** less than or equal to the remaining sum.
- Subtract it from the current sum.
- Repeat until the sum becomes 0.

>  This greedy strategy always works for Fibonacci numbers because of their fast growth — no better combination exists.

---

##  Constraints

- 1 ≤ k ≤ 10⁹

---

##  Input Format

- A single integer `k`

##  Output Format

- A single integer representing the **minimum number of Fibonacci numbers** whose sum is equal to `k`

---

##  Example:

Enter value of k: 19

Minimum number of Fibonacci numbers: 3

# Problem 4: Fractional Knapsack (Greedy Algorithm)

## 📌 Problem Statement

You are given `n` items, each with a **value** and a **weight**, and a knapsack with a **capacity `W`**. Your task is to maximize the **total value** of items in the knapsack.

> You are allowed to take **fractional parts** of items.

---
📎 **GFG:** [Fractional Knapsack](https://practice.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1)  
📺 **YouTube:** [take U forward](https://www.youtube.com/watch?v=F_DDzYnxO14), [GeeksforGeeks](https://www.youtube.com/watch?v=vmLJzQsXRzo)

## Greedy Approach

1. Compute the **value-to-weight ratio** for each item.
2. Sort items in **descending order of ratio**.
3. Pick full items greedily until the knapsack is full.
4. If an item cannot fit completely, take the **fraction that fits**.
5. Stop when the capacity becomes 0.

>  This greedy approach always gives the optimal result in fractional knapsack problems.

---

##  Constraints

- 1 ≤ n ≤ 10⁴
- 1 ≤ W ≤ 10⁶
- 1 ≤ valueᵢ, weightᵢ ≤ 10⁴

---

##  Input Format

- First line: Integer `W` – knapsack capacity
- Second line: Integer `n` – number of items
- Next `n` lines: Each line contains two integers – `value` and `weight`

##  Output Format

- Maximum value that can be carried, rounded to **2 decimal places**

---

## Example: 
50

3

60 10

100 20

120 30

240.00


#  Problem 5: Minimum Number of Platforms Required

## 📌 Problem Statement

Given the **arrival and departure times of `n` trains**, your task is to determine the **minimum number of platforms required** at the railway station so that no train waits.

---
📎 **LeetCode:** [Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii/)  
📎 **GFG:** [Minimum Platforms](https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1)  
📺 **YouTube:** [take U forward](https://www.youtube.com/watch?v=dxVcMDI7vyI)

##  Constraints

- 1 ≤ n ≤ 10⁴
- Time is represented in **HHMM format** (e.g., 900 for 9:00 AM)

---

##  Approach

1. Sort the **arrival** and **departure** arrays separately.
2. Use a **two-pointer** technique:
    - If the next train arrives before the earliest departure, we need an extra platform.
    - Otherwise, free a platform.
3. Track the **maximum number of platforms needed at any time**.

>  This greedy-style timeline approach ensures optimal platform allocation.

---

##  Input Format

- First line: Integer `n` – number of trains
- Next `n` lines: Each line contains two integers: `arrival` and `departure` times (in HHMM format)

##  Output Format

- A single integer – **minimum number of platforms required**

---

## Example:
Enter number of trains: 6

Enter arrival and departure times (in HHMM format):

900 910

940 1200

950 1120

1100 1130

1500 1900

1800 2000

Minimum number of platforms required: 3


# Problem 6: Job Scheduling to Maximize Profit

## 📌 Problem Statement

You are given `n` jobs where each job has:
- A **deadline** (by which it must be completed)
- A **profit** (earned if the job is completed before or on its deadline)

Each job takes **exactly 1 unit of time**, and **only one job can be performed at a time**.

Your goal is to **schedule jobs** to **maximize total profit** while ensuring that each job is finished before its deadline.

---
📎 **LeetCode:** [Maximum Profit in Job Scheduling](https://leetcode.com/problems/maximum-profit-in-job-scheduling/)  
📎 **GFG:** [Job Sequencing Problem](https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1)  
📺 **YouTube:** [take U forward](https://www.youtube.com/watch?v=LjPx4wQaRIs), [GeeksforGeeks](https://www.youtube.com/watch?v=eGf-26OTI-A)

## Greedy Approach

1. **Sort jobs** in descending order of profit.
2. For each job, try to schedule it on the **latest available day** ≤ its deadline.
3. Use a boolean array to keep track of used time slots.
4. Count how many jobs are scheduled and sum their profits.

>  This greedy strategy ensures optimal results because we always prioritize the most profitable jobs first.

---

## Constraints

- 1 ≤ n ≤ 10⁴
- 1 ≤ deadlineᵢ ≤ 1000
- 1 ≤ profitᵢ ≤ 10⁴

---

##  Input Format

- First line: Integer `n` – number of jobs
- Next `n` lines: Two integers per line — `deadline` and `profit` for each job

##  Output Format

- Two integers:
    1. Number of jobs scheduled
    2. Total profit earned

---

## Example:

Enter number of jobs: 4

Enter deadline and profit for each job:

4 20

1 10

1 40

1 30

Number of jobs scheduled: 2

Total profit: 60


# Problem 7: Minimum Number of Refueling Stops

## 📌 Problem Statement

You are traveling a certain `target` distance starting with `startFuel` amount of fuel.  
Along the way, there are gas stations at specific distances, each offering a certain amount of fuel.

Your task is to determine the **minimum number of refuels required** to reach the destination.  
If it's not possible to reach the destination, return `-1`.

---
📎 **LeetCode:** [Minimum Number of Refueling Stops](https://leetcode.com/problems/minimum-number-of-refueling-stops/)  
📺 **YouTube:** [NeetCode](https://www.youtube.com/watch?v=s6kQW6OyaQA), [Coding Decode](https://www.youtube.com/watch?v=GWmYZsP4h-c)

## Constraints

- 1 ≤ target ≤ 10⁹
- 0 ≤ startFuel ≤ target
- 0 ≤ stationᵢ ≤ target
- 1 ≤ fuelᵢ ≤ 10⁴

---

## Greedy + Max Heap Approach

1. Use a **max-heap** (priority queue) to store fuel from all reachable stations.
2. At each step:
    - Push all reachable station fuels into the heap.
    - If you can't go further and heap is empty → return `-1`.
    - Else, refuel from the station offering the **most fuel**.
3. Repeat until the destination is reached.

>  This ensures we always make the most efficient refuel choice.

---

## Input Format

- First line: `target` – total distance to travel
- Second line: `startFuel` – initial amount of fuel
- Third line: `n` – number of stations
- Next `n` lines: Two integers per line – `positionᵢ fuelᵢ`

##  Output Format

- A single integer: **minimum number of refuels** required to reach the target
- Or `-1` if it's not possible

---

## Example:


Enter target distance: 100

Enter initial fuel: 10

Enter number of stations: 4

Enter station positions and fuel:

10 60

20 30

30 30

60 40

Minimum number of refuels: 2




