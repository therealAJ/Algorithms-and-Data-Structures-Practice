# Algorithms-and-Data-Structures-Practice

******************************************************************************************************************************************



Made this repo for practicing basic algorithms and data structures :)
Notes will be taken as I traverse through my adventure! 
I'll play it safe and use Java for implementation. 

Topics I will attempt to cover:
- An Introduction to Algorithms
- Analysis of Algorithms 
- Arrays 
- Sorting Algorithms 
- Linked Lists 
- Stacks
- Queues 
- Recursion 
- More Advanced Sorting Algorithms 
- Binary Trees 
- Hash Tables 
- Heaps 











INTRODUCTION
*************



What is an Algorithm?

An algorithm is a way of solving well-specified computational problems. An algorithm contains a finite set of  rules that give a sequence of operations for solving a specific type of problem. Algorithms give us an idea of running time taken by a certain problem , as well as it allows us to decide on certain hardware requirements. Algorithms correctness can be proven through proofs (Statement to be proven, list all assumption, chain of reasoning from assumptions to the statement). 


Euclid's Algorithm 

Used to find the GCD of two positive numbers. Consider two positive integers 'm' and 'n' such that m > n. First, divide m by n, and let the remainder be r. If r = 0, the algorithm ends, n is the GCD. Else, set m -> n, n -> r, go back and repeat until r = 0. 
(This is an example of a recursive algorithm)


Analysis of Algorithms 
***********************

Two factors to be considered when analyzing an algorithm: Space complexity and Time Complexity. With regards to time complexity, the environment in which the alogrithm is being ran has a direct correlation to performance. We measure time in terms of its order or growth. 

RAM Model of Computation: Infinite memory, each operation takes unit time, and for each memory access unit time is consumed, and data may be accessed from RAM or disk. 

Time complexity example: 
Bubble sort - number of steps for n-1 > n = 4 (1 comparison, 3 swaps)
For an array of 5 (worst case)  = 16 + 12 + 8 + 4 , 4(4 + 3 + 2 + 1), 4(n-1 + n-2 + ... 3 + 2 + 1), 2n(n - 1),  pn^2 + qn + r
This is quadratic time. 

Big O notation: 

eg. O(n^2) = {f(n): there exist positive constants c and n* such that 0 <= f(n) <= cn^2 for all n >= n*

generalized statement: O(g(n)) =  {f(n): there exist positive constants c and n* such that 0 <= f(n) <= cg(n) for all n >= n*

More examples: 
5n² + 6 ∈ O(n²) 
cn² such that c = 6 and n° = 3 therefore True. 

HIERARCHY OF TIME COMPLEXITIES: 
logn ≤ √n ≤ n ≤ nlogn ≤ n² ≤ n³ ≤ 2^n ≤ n!

Accessing array elements by index: O(1) : Constant time 
Searching array for a[n] = val : O(n) : Linear time 

Sorting Algorithms (Basic)
**************************
1. Bubble Sort - O(n^2)
2. Selection Sort - O(n^2)
3. Insertion Sort - O(n^2) 









