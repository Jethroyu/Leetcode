package problemset.question1207;

import java.util.HashSet;
import java.util.Set;

/**
 * @author shidu
 * @date 2020/10/28 13:53
 */
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] sign = new int[2002];
        for (int i = 0; i < arr.length; i++){
            sign[arr[i]+1000]++;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < sign.length; i++){
            if (sign[i]!=0){
                if (!set.contains(sign[i])) {
                    set.add(sign[i]);
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}