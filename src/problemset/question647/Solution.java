package problemset.question647;

class Solution {
    public int countSubstrings(String s) {
        int ans = 0;
        //中间往两边扩散算法
        for (int i = 0; i < s.length(); i++){
            //以数字为中间点
            int left = i;
            int right = i;
            while (left>-1 && right<s.length()){
                if (s.charAt(left) == s.charAt(right)) {
                    ans++;
                    left--;
                    right++;
                }
                else
                    break;
            }
            //以两数之间为中间点
            left = i;
            right = i+1;
            while (left>-1 && right<s.length()){
                if (s.charAt(left) == s.charAt(right)) {
                    ans++;
                    left--;
                    right++;
                }
                else
                    break;
            }
        }
        return ans;
    }
}