# Dynamic Programming

---


## State

In the context of Dynamic Programming (DP), *a "state" refers to a specific configuration or set of parameters that uniquely define a subproblem within a larger problem.* 

States are a fundamental concept in Dynamic Programming, used to break down complex problems into smaller, more manageable subproblems.

1. Subproblem: 
	In many Dynamic Programming problems, you have a larger problem that can be divided into smaller, overlapping subproblems. Solving these subproblems and storing their solutions in a table (often an array or matrix) is a key idea in DP.

2. State: 
	Each subproblem is described by a state, which is a set of variables or parameters that uniquely identify it. These variables capture the essence of the subproblem. For example, in the Fibonacci sequence problem, a state can be represented by a single variable, `n`, which denotes the position in the sequence.

3. State Transition:
	DP involves defining how to transition from one state to another. In other words, you determine how to compute the solution to a subproblem based on the solutions to a smaller, related subproblems.

4. Memoization or Tabulation (Table-filling):
	As you compute the solution to subproblems, you store these solutions in a data structure (often called a "table" or "memoization table"). The table helps to avoid redundant work by caching the results of already solved problems.

In complex DP problems, states can involve multiple variables, such as in problems involving sequences, strings, or grids.
Understanding and defining right states are crucial for solving problems efficiently using dynamic programming techniques. 


### Penultimate State

Penultimate state refer to the state or states that are immediately before the current state in a dynamic programming solution. 

In some DP problems, you may need information from the state(s) just before the current one to compute the solution efficiently. 

For example, in a problem involving sequences, if you're calculating something about the current element depends on the penultimate states, which represents the previous element in the sequence. 

Understanding and correctly using penultimate states is important for designing effective dynamic programming algorithms.


### Mutually Exclusive States

In the context of DP, mutually exclusive states mean that each state doesn't overlap or duplicate information with other states. 
Each state represents a unique and distinct subproblem.

### Mutually Exhaustive States

Exhaustive states imply that the set of states that you define covers all possible subproblem that need to be solved to compute the final solution.


---
## Top-Down Approach in Dynamic Programming 


## Bottom-Up Approach in Dynamic Programming (Iterative)

Start from the smallest sub-problem for which we already know the answer to (for instance, a base case).
Use this to iteratively solve the bigger problem.



---

## Steps to solve problems involving recursion that may have a DP solution.

1. Notion of Choice.                  *(Is there a notion of choice?)*
2. Representation of a State.     *(What represents a state of the solution?)*
3. Recurrence Relationship.       *(How can I write a recurrence relationship using the steps 1 and 2?)*
4. The Final State.                      *(How can I achieve the final state?)*

### *Let's understand these steps with an example.*
#### The staircase

Let's suppose you are climbing a staircase with `N` stairs.

You can either climb one stair at a time; or, two stairs at a time.

The goal is to find number of distinct ways that you can reach the top.

---
#### The solution

##### 1. Notion of Choice: *(Is there a notion of choice?)*

The problem suggests that we climb the stairs either one at a time or two at a time.
This indicates 2 possible choices:
	1. Take one stair at a time.
	2. Take two stairs at a time.

Therefore, the answer to our question, 'Is there a notion of choice' is 'yes', there is a notion of choice.

Whenever we identify that involves a notion of choice, it often indicates the potential for a recursive solution.


##### 2. Representation of a State: *(What represents a state of the solution?)*

Now, we need to figure out how we can represent a state of the solution.

A state is like a snapshot of a problem at a certain time.
This snapshot should give us all the information we need to figure out a solution for that part of the problem.

Let's take a look at the `i` <sup>th</sup>  stair.

![[staircase-problem-ith-state.png]]

For this `i`<sup>th </sup> stair, we are calculating the number of distinct ways to reach stair `i`.

Let's call the function that calculates our solution as `ways(numberOfStairs)`.
So, to calculate for the `i`<sup>th</sup> stair, it will be `ways(i)`.

The function `ways(i)` represents a state for calculating the number of distinct ways to reach `i`<sup>th</sup> stair.


##### 3. Recurrence Relationship *(How can I represent this state using Step 1 and 2?)*

In step 1, we understood that there are 2 choices we can make.
1. Take one stair at a time
2. Take two stairs at a time.

To realize the recurrence relationship, we must be able to trace back to the previous state that enable us to reach the `i`<sup>th</sup> stair.

There are 2 ways in which you could reach to the `i`<sup>th</sup> stair.
1. *From the  `(i - 1)`<sup>th</sup> stair, by taking one stair at a time.* 
 		                          or 
2. *From the `(i - 2)`<sup>th</sup> stair, by taking two stair at a time.*


Additionally, 
the number of distinct ways to reach to the `i`<sup>th</sup> stair from `(i - 1)`<sup>th</sup> stair is 1.
And, the number of distinct ways to reach to the `i`<sup>th</sup> stair from `(i - 2)`<sup>th</sup> stair is also 1.

These are the 2 penultimate states that are crucial to understand the recurrence relation for the solution.

Also, 
These states are **mutually exclusive**, meaning they cannot occur simultaneously or overlap with each other. 

These states are also **mutually exhaustive**, meaning together they cover all possible scenarios, leaving no room for any other state to exist within the given context.


![[staircase-problem-penultimate-states.png]]


Before, jumping to the concurrency relationship, let's understand the scenario the following scenario.

![[staircase-problem-possible-paths-example.png]]


There are 3 nodes; `A`, `B` and `C`.
These nodes are connected via paths; `1`, `2`, `3`, `x` and `y`, as shown in the diagram above.
The goal is to find number of possible ways from `A` to `C` via these paths.

Let's take a closer look at all the three nodes; we can consider the possibilities form the node `B` to `C` as the penultimate states of our solution.

```
A possible path from B to C is either x or y.

	Number of possible ways from B to C = Path x or Path y
                           ∴  ways(B→C) = Path x + Path y
                           ∴  ways(B→C) = 1 + 1
	 	 				   ∴  ways(B→C) = 2

The number of possible ways from B to C is 2.
```

Unlike the penultimate states in the staircase problem, the penultimate states in this problem are not mutually exclusive. This is because the number of possible ways from B to C is supposed to be included in the final solution.

Therefore, to find out the total number of possible ways from `A` to `C`, we see that..


```
A possible path from A to B is either 1, 2 or 3.
A possible path from B to C is either x or y.

Number of possible ways from A to C will include all the possible ways from A to B and the number of possible ways from from B to C. 

∴

Number of possible ways            Number of possible ways      Number of possible ways                                                             &  
	 from A to C             =          from A to B                  from B to C
   (final solution)    


	∴    ways(A→C)           =           ways(A→B)          &          ways(B→C)


	∴    ways(A→C)           =           ways(A→B)          X          ways(B→C)   

Finally,
    ∴    ways(A→C) = ways(A→B) X ways(B→C)

		 is the solution to the number of possible ways from A to C.
					
```

The expression, `ways(A→C) = ways(A→B) X ways(B→C)` represents the recurrence relation between the final solution `ways(A→C)` and the subproblems that amounts to the solution.


