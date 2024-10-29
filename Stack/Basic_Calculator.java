/*
        [Q.224]
        Leetcode Link               : https://leetcode.com/problems/basic-calculator/
        Company Tags                : META
*/


/********************************************* JAVA *********************************************/
//Approach - Using Stack and Dimag
//T.C : O(n) 
//S.C : O(1)

class Solution {
  public int calculate(String str) {
      int n=str.length();
      Stack<Integer> s=new Stack<>();
      int number=0;
      int sign=1;
      int result=0;
      for(int i=0;i<n;i++)
      {
          char ch=str.charAt(i);
          if(Character.isDigit(ch))
          {
              number=number*10+(ch-'0');
          }
          else if(ch=='+')
          {
              result+=number*sign;
              number=0;
              sign=1;
          }
          else if(ch=='-')
          {
              result+=number*sign;
              number=0;
              sign=-1;
          }
          else if(ch=='(')
          {
              s.push(result);
              s.push(sign);
              sign=1;
              number=0;
              result=0;
          }
          else if(ch==')')
          {
              result+=number*sign;
              number=0;
              result*=s.pop();
              result+=s.pop();
          }
      }
      result+=sign*number;
      return result;
  }
}