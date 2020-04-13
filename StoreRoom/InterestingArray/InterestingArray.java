import java.util.*;
import java.io.*;

public class Main {
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
      for(int j=i+1;j<n;j++){
        int res = (int)Math.abs(a[i] - a[j]);
        if(res==k)
        count++;
        else if(res > k)
        break;
      }
    }
    System.out.println(count);
    
  }
}