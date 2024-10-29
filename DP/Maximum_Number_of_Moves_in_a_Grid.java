/*
        [Q.2684]
        Leetcode Link               : https://leetcode.com/problems/maximum-number-of-moves-in-a-grid/

        -- Problem of the Day
*/


/********************************************* JAVA *********************************************/
//Approach - 
//T.C : O(m*n) 
//S.C : O(m*n)

class Solution {
  int m,n;
  int dfs(int row, int col, int[][] grid, int temp[][])
  {
      if(temp[row][col]!=-1){
          return temp[row][col];
      }

      int directions[]={-1,0,1};
      int moves=0;
      for(int dir:directions)
      {
          int newrow=row+dir;
          int newcol=col+1;
          if(newrow>=0 && newrow<m && newcol>=0 && newcol<n && 
          grid[newrow][newcol]>grid[row][col])
          {
              moves=Math.max(moves,1+dfs(newrow,newcol,grid,temp));
          }
      }
      return temp[row][col]= moves;
  }
  public int maxMoves(int[][] grid) {
      m=grid.length;
      n=grid[0].length;
      int ans=0;
      int temp[][]=new int[m][n];
      for (int i = 0; i < m; i++) 
      {
          Arrays.fill(temp[i], -1);
      }
      for(int i=0;i<m;i++)
      {
          ans=Math.max(ans,dfs(i,0,grid,temp));
      }
      return ans;
  }
}