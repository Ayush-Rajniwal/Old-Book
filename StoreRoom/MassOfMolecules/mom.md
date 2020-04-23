# Mass of Molecules
The task is to find the mass of the given molecules.
All the molecules that you gets are having only three atoms H i.e hydrogen atom, O i.e oxygen atom and C i.e. carbon atom.
Each of them has mass 1, 16 and 12 respectively.

If the molecule is COOHH it means it has 1 atom of carbon, 2 atoms of oxygen and 2 atoms of hydrogen and it can also be written as CO2H2 or CO(OH)H or CO2(H2).

Write a code to get molecule weight for the given formula. Weight of given formula is the sum of all its atoms so if Molecule of COOH or CO2H or (CO)(OH), its weight would be 12+16+16+1 which is 45.

**Note:** Formula will only contain C, H, O , (, ), 1, 2,3,4,5,6,7,8,9.


**Input Format**

The first line contains of the formula F of length N.

**Output Format**

The output contains a single line, the weight of the molecules.

**Constraints**

1<=N<=10^6

**Example**

*Input*
COOH
*Output*
45

## Approach

### Stack | [Code](/StoreRoom/MassOfMolecules/mom.java)

* If we get C,O,H as input we will push there mass to the stack.
* If we get a number between 1-9 then we will pop the last element, multiply it with the number between 1-9; Push the product back to the stack. 
   *For example in O2*
    We will first push 16(mass of Oxygen), then as we scan '2', we pop 16, multiply it by 2 i.e. 32 and push 32 back to the stack.

Above points can handle all the cases of without bracket. 
Now let's look for handling the brackets.
*Suppose we have this as input (CO)2 => answer should be (12+16)*2 => 56* 
We basically need to find the sum of number inside bracket.
* As soon as we get opening bracket '(', we wil push -1 to stack. Why? Because we need some reference to the point where bracket open.
* As soom as we get closing bracket ')', we pop the element till we find -1 (i.e. the opening bracket) and find the sum of all elements between them.
* Push the sum into the stack.
```java
int temp = st.pop();
        int sum=0;
        while(temp!=-1){
          sum+=temp;
          temp=st.pop();
        }
st.push(sum);
```

* Once all the elements are scanned, find the sum of all the numbers in the stack. That's the answer!!
