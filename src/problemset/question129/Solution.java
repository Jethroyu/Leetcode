package problemset.question129;

import template.TreeNode;

import java.util.LinkedList;

/**
 * @author shidu
 * @date 2020/10/29 14:16
 */
class Solution {
    LinkedList<Integer> numsSum = new LinkedList<>();
    public int sumNumbers(TreeNode root) {
        if(root == null) {
            return 0;
        }
        DFS(root,0);
        int ans = 0;
        for (int i = 0; i <numsSum.size(); i++){
            ans+=numsSum.get(i);
        }
        return ans;
    }

    public void DFS(TreeNode root,int nowValue){
        nowValue*=10;
        nowValue+=root.val;
        if (root.left == null && root.right == null) {
            numsSum.add(nowValue);
        }
        else {
            if (root.left != null) {
                DFS(root.left, nowValue);
            }
            if (root.right != null) {
                DFS(root.right, nowValue);
            }
        }
    }
}