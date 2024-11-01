/*
        [Q.899]
        Leetcode Link               : https://leetcode.com/problems/orderly-queue/description/
        Company Tags                : AMAZON

        -- HARD
*/


/********************************************* c++ *********************************************/
//Approach - 
//T.C : O(n^2) 
//S.C : O(n)


class Solution {
public:
    string orderlyQueue(string s, int k) {
        if(k>1)
        {
            sort(s.begin(),s.end());
            return s;
        }
        string ans=s;
        for(int i=1;i<s.length();i++)
        {
            string temp=s.substr(i)+s.substr(0,i);
            ans=min(ans,temp);
        }
        return ans;
    }
};