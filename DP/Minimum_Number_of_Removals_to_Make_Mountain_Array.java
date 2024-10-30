/*
        [Q.1671]
        Leetcode Link               : https://leetcode.com/problems/minimum-number-of-removals-to-make-mountain-array/description/

        -- Problem of the Day
*/


/********************************************* JAVA *********************************************/
//Approach - 
//T.C : O(n^2) 
//S.C : O(n)

class Solution {
  public int minimumMountainRemovals(int[] nums) {
      int n=nums.length;
      int LIS[]=new int[n];
      Arrays.fill(LIS,1);
      int LDS[]=new int[n];
      Arrays.fill(LDS,1);
      for(int i=0;i<n;i++)
      {
          for(int j=i-1;j>=0;j--)
          {
              if(nums[i]>nums[j])
              {
                  LIS[i]=Math.max(LIS[i],LIS[j]+1);
              }
          }
      }
      for(int i=n-1;i>=0;i--)
      {
          for(int j=i+1;j<n;j++)
          {
              if(nums[i]>nums[j])
              {
                  LDS[i]=Math.max(LDS[i],LDS[j]+1);
              }
          }
      }
      int minremoval=n;
      for(int i=0;i<n;i++)
      {
          if(LIS[i]>1 && LDS[i]>1)
          minremoval=Math.min(minremoval,n-LIS[i]-LDS[i]+1);
      }
      return minremoval;
  }
}