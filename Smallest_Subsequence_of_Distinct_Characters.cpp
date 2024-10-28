/*
      Leetcode Link               : https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/
      EXACT SAME QUES             : https://leetcode.com/problems/remove-duplicate-letters/
      Company Tags                : GOOGLE, Oracle Online Assessment
*/


/********************************************* C++ *********************************************/
//Approach - Using string as a stack
//T.C : O(n) 
//S.C : O(1)

class Solution {
public:
    string removeDuplicateLetters(string s) {
        int n=s.length();
        string ans;
        vector<bool>taken(26,false);
        vector<int> lastidx(26);
        for(int i=0;i<n;i++)
        {
            char ch=s[i];
            lastidx[ch-'a']=i;
        }
        for(int i=0;i<n;i++)
        {
            char ch=s[i];
            int idx=ch-'a';
            if(taken[idx]==true)
            continue;
            while(ans.length()>0 && ans.back()>ch && lastidx[ans.back()-'a']>i)
            {
                taken[ans.back()-'a']=false;
                ans.pop_back();
            }
            ans.push_back(ch);
            taken[idx]=true;
        }
        return ans;

    }
};