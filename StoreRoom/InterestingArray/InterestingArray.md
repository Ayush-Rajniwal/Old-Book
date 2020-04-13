# Interesting Array

You are given an array consisting of N integers and integer K. Find number of pairs that have difference value equal to K.

**Input:**

First line contains two integers N and K space separated. 
Second Line contains N space-separated integers denoting elements of array.

**Output:**
Print a single integer denoting the number of pairs.

**Constraints:**

2 ≤ n ≤ 10^5

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

```java
Arrays.sort(a);
for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++){
        int res = (int)Math.abs(a[i] - a[j]);
        if(res==k)
        count++;
        else if(res > k)
        break;
      }
    }
```

* Sort the Array.
* Pick starting element of the Array
* Find its difference with other remaining elements in the Array.
* If difference is equal to k we increase the count.
* If the difference is more than k then we can stop. This is because Array is sorted and if one element has difference more than k then remaining greater elements will have the difference more than that.
* Repeat this process by picking other reamining elements.

### Binary Search Approach | [Code](./InterestingArrayBin.java)

```java
Arrays.sort(a);
for(int i=0;i<n;i++)
    {
     int low=i;
     int high =n-1;
     
     while(low <= high){
      
      int mid = low + (high-low)/2;
      int diff = (int)Math.abs(a[i] - a[mid]);
      
      if( diff==k )
       count++;
       
      if(diff < k)
      low=mid+1;
      
      else
      high = mid-1;
     }
     
    }
```
**Conecept I am using here:**
We are using binary search to pick an element which is obviously the middle one.
Then we find the difference between the middle element and the element at the lower bound.


If the Difference is less than k then this **ensure** us that all the elements on the left of the middle will have difference lesser then k, as array is sorted. Thus we bring our lower bound to mid+1.

Similarly, if the difference between middle element and the element at the lower bound  if greater then k, then this **ensure** that all the elements on the right of middle will have difference greater then k. Thus we bring our upper bound to mid-1.


* Sort the Array.
* Make the starting index as the lower bound of the Binary Search.
* Perform Binary Search 
* Find the difference between the selected middle element and the element at the lower bound. 
* If difference == k then increase the count.
* If difference < k then increase the lower bound.
* Otherwise decrease the upper bound.
* Repeat the process for remaining element. 