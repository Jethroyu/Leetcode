package solution.question47;

import java.util.*;

/**
 * 可以加一个剪枝，就是搜索的时候如果已经遇见了就不再搜了
 * @author shidu
 * @date 2020/9/18 10:53
 */

class Solution {
    public static void main(String[] args) {
        int[] num = {1,1,2};
        System.out.println(new Solution().permuteUnique(num));
    }
    List<List<Integer>> end = new ArrayList<>();
    Set<String> ans = new TreeSet<>();
    int cutLength;
    int[] nums;
    public List<List<Integer>> permuteUnique(int[] nums) {
        this.nums = nums;
        cutLength = nums.length;
        LinkedList<Integer> list = new LinkedList<>();
        boolean[] sign = new boolean[nums.length];
        Set<Integer> flag = new HashSet<>();
        for (int i = 0; i < sign.length; i++){
            if (!sign[i] && !flag.contains(nums[i])){
                boolean[] temp = Arrays.copyOf(sign,sign.length);
                LinkedList<Integer> tempList = new LinkedList<>(list);
                temp[i] = true;
                tempList.add(nums[i]);
                flag.add(nums[i]);
                DFS(tempList,temp);
            }
        }
        return end;
    }

    void DFS(LinkedList<Integer> now,boolean[] sign){
        if (now.size() == cutLength){
            if (!ans.contains(now.toString())){
                ans.add(now.toString());
                end.add(now);
            }
        }
        else {
            Set<Integer> flag = new HashSet<>();
            for (int i = 0; i < sign.length; i++){
                if (!sign[i]){
                    boolean[] temp = Arrays.copyOf(sign,sign.length);
                    LinkedList<Integer> tempList = new LinkedList<>(now);
                    temp[i] = true;
                    tempList.add(nums[i]);
                    flag.add(nums[i]);
                    DFS(tempList,temp);
                }
            }
        }
    }
}