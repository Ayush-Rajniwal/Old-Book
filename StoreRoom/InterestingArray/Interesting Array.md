# Interesting Array

You are given an array consisting of N integers and integer K. Find number of pairs that have difference value equal to K.

**Input:**

First line contains two integers N and K space separated. 
Second Line contains N space-separated integers denoting elements of array.

**Output:**
Print a single integer denoting the number of pairs.

**Constraints:**

2 ≤ n ≤ 105

0<k, arr[i] < 10^9

**Time Limit:**
1 second

**Example**

Input
5 2
1 5 3 4 2

Output
3

**Sample test case explanation**
The pairs are (1,3), (2,4) and (3,5).

## Approach

### Brute Force | [Code](./InterestingArray.java)

* Sort the Array.
* Pick one element from the Array
* Find its difference with other remaining elements in the Array.
* If difference is equal to k we increase the count.
* If the difference is more than k then we can stop. This is because Array is sorted and if one element has difference more than k then remaining greater elements will have the difference more than that.
* Repeat this process by picking other reamining elements.
