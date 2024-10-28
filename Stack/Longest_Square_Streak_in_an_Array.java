/*
        [Q.2501]
        Leetcode Link               : https://leetcode.com/problems/longest-square-streak-in-an-array/
        -- Problem of the Day
*/


/********************************************* C++ *********************************************/
//Approach - Using Map, Sorting
//T.C : O(n) 
//S.C : O(1)

class Solution {
  public int longestSquareStreak(int[] nums) {
      Map<Integer,Integer> mp=new HashMap<>();
      Arrays.sort(nums);
      int mxstreak=0;
      for(int num:nums)
      {
          int root=(int)Math.sqrt(num);
          if(root*root==num && mp.containsKey(root))
          mp.put(num,mp.get(root)+1);
          else
          mp.put(num,1);
          mxstreak=Math.max(mxstreak,mp.get(num));
      }
      return mxstreak<2?-1:mxstreak;
      
  }
}