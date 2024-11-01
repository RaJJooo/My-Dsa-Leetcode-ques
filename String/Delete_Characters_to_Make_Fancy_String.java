/*
        [Q.1957]
        Leetcode Link               : https://leetcode.com/problems/

        -- Problem of the Day
*/


/********************************************* JAVA *********************************************/
//Approach - 
//T.C : O(m*n) 
//S.C : O(m*n)


class Solution {
  public String makeFancyString(String s) {
      StringBuilder ans=new StringBuilder();
      int count=1;
      ans.append(s.charAt(0));
      for(int i=1;i<s.length();i++)
      {
          char ch=s.charAt(i);
          if(ch==ans.charAt(ans.length()-1))
          {
              count++;
              if(count<3)
              ans.append(ch);
          }
          else
          {
              count=1;
              ans.append(ch);
          }
      }
      return ans.toString();
  }
}