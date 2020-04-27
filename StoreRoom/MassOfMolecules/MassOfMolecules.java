package StoreRoom.MassOfMolecules;

import java.util.*;
import java.io.*;

public class MassOfMolecules {
  public static void main(String args[]) throws IOException {
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    Stack<Integer> st = new Stack<>();
    
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      if(ch=='(')
      st.push(-1);
      else if(ch=='C')
      st.push(12);
      else if(ch=='O')
      st.push(16);
      else if(ch=='H')
      st.push(1);
      else if((int)ch>=47 && (int)ch<=57){ //If character is a number between 1-9

        //Character.getNumericValue(ch) convert character '1' to numercical 1
        int temp = st.pop() * Character.getNumericValue(ch);
        st.push(temp);
      }
      //If bracket close find the sum till -1
      else if(ch==')'){
        int temp = st.pop();
        int sum=0;
        while(temp!=-1){
          sum+=temp;
          temp=st.pop();
        }
        st.push(sum);
      }
      
    }
    int sum=0;
    for(int i:st)
    sum+=i;
    System.out.println(sum);
  }
}