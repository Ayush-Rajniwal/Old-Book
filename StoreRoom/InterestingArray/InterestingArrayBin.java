package StoreRoom.InterestingArray;

import java.util.*;
import java.io.*;

public class InterestingArrayBin {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int k = sc.nextInt();
    int count=0; 
    int a[] = new int[n];
    
    for(int i=0;i<n;i++)
    a[i] = sc.nextInt();
    
    Arrays.sort(a);
    
    for(int i=0;i<n;i++)
    {
     int low=i;
     int high =n-1;
     
     while(low <= high){
      
      int mid = low + (high-low)/2;
      int res = (int)Math.abs(a[i] - a[mid]);
      
      if( res==k )
       count++;
       
      if(res < k)
      low=mid+1;
      
      else
      high = mid-1;
     }
     
    }
    System.out.println(count);
    
  }
}