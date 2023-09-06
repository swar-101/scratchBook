# Bulb Switcher
---
## Problem Description

A wire connects N light bulbs.

Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.

Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.

You can press the same switch multiple times.

**Note:** 0 represents the bulb is off and1 represents the bulb is on.

---
## Problem Constraints

```
0 <= N <= 5 x 10^5
0 <= A[i] <= 1
```
---
## Input Format

The first and only argument contains an integer array A, of size N.

---

## Output Format

Return an integer representing the minimum  number of switches required.

---

## Example Input

Input 1:
`A = [0, 1, 0, 1]`

Input 2:
`A = [1, 1, 1, 1]`

---

## Example Output

Output 1: 
`4`

Output 2:
`0`

---

## Example Explanation

Explanation 1:

```
press switch 0 : [1 0 1 0]
press switch 1 : [1 1 0 1]
press switch 2 : [1 1 1 0]
press switch 3 : [1 1 1 1]
```

Explanation 2:

`There is no need to turn any switch on as all the bulbs are already on.`


---

## Dry Run

Let's suppose there is an array A.

A = [1, 1, 0, 1, 0, 0, 1, 0]
 
| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |  
|--|--|--|--|--|--|--|--|
| 1 | 1 | 0 | 1 | 0 | 0 | 1 | 0 |

There are 8 bulbs.
The goal is to find the minimum number of switches to press to turn on all the lights.


Step 1:

For indices 0 and 1, we don't need to press the switch since the bulbs are already on.
So we press the switch on `index 2`.

| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |  
|--|--|--|--|--|--|--|--|
| 1 | 1 | 1 | 0 | 1 | 1 | 0 | 1 |

This will also change the state of the bulb to the right of `index 2` i.e. from `index 3` to `index 7`, as shown above.
So far, we have pressed a switch 1 time.


Step 2:

Now, we press the switch at `index 3`.

| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |  
|--|--|--|--|--|--|--|--|
| 1 | 1 | 1 | 1 | 0 | 0 | 1 | 0 |

This will give us a result as mentioned above.
So far, we have pressed a switch 2 time.


Step  3:

Now, we press the switch at `index 4`.

| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |  
|--|--|--|--|--|--|--|--|
| 1 | 1 | 1 | 1 | 1 | 1 | 0 | 1 |

This will give us a result as mentioned above.
So far, we have pressed a switch 3 times.


Step 4:

Now, we press the switch at `index 6`.

| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |  
|--|--|--|--|--|--|--|--|
| 1 | 1 | 1 | 1 | 1 | 1 | 1 | 0 |

This will give us a result as mentioned above.
So far, we have pressed a switch 4 times.

Step 5:

Now, we press the switch at `index 7`

| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |  
|--|--|--|--|--|--|--|--|
| 1 | 1 | 1 | 1 | 1 | 1 | 1 | 1 |

This will give us the result where all  the bulbs are turned on.
The total number of bulbs that we pressed becomes 5.

## Afterthought

*A Key Observation:* 
A key observation we can make is that if the same switch is pressed twice, it is equivalent to not pressing it all. Therefore, we avoid pressing the same switch twice.

*Optimization objective:*
The problem's optimization objective is to turn on all the lights with minimum switch presses.
We aim to achieve this by making efficient choices while considering the initial state of each bulb.

*Subproblem Decomposition:*
The problem can be decomposed into individual bulbs and their initial states. 
Each bulb is a subproblem on its own.
The goal is to determine whether it needs to be switched on based on its initial state.

*The Greedy Choice Criteria:*
The Greedy Choice here is straightforward.
If the state of the bulb `i` is OFF, we press the switch.

*Proving Correctness:* 
To prove the correctness of this approach, we need to demonstrate that the chosen greedy choice indeed leads to an optimal or near-optimal solution.
Proof of Contradiction: Suppose, there was an optimal solution that allowed us to press lesser switches than our solution. This is not practically possible because in order to turn on all the lights, the light that are OFF need to be switched on.

---

# Pseudocode

```C
int minimumSwitchPresses(A) {
	int count = 0;  // Initialize the switch count to 0

	for (i = 0; i <= A.size; i++) {
		if (A[i] == 0) {
			count ++;
		}
		// Toggle all the bulbs from right of the current bulb.
		for (j = i; j <= A.size; j++) {
			A[j] = 1 - A[j]; // Toggles the state of the bulb.
		}
	}

	return count;
}
```

---



