/*
        [Q.2490]
        Leetcode Link               : https://leetcode.com/problems/circular-sentence/description/

        -- Problem of the Day
*/


/********************************************* JAVA *********************************************/
//Approach - Normal String prob
//T.C : O(m*n) 
//S.C : O(m*n)


class Solution {
  public boolean isCircularSentence(String sent) {
      int n=sent.length();
      for(int i=0;i<n;i++)
      {
          char ch=sent.charAt(i);
          if(ch==' ')
          {
              if(sent.charAt(i-1)==sent.charAt(i+1))
              continue;
              else 
              return false;
          }
      }
      if(sent.charAt(0)==sent.charAt(n-1))
      return true;
      else
      return false;
  }
}