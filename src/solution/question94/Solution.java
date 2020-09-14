package solution.question94;

import template.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author shidu
 * @date 2020/9/14 10:16
 */
class Solution {
    List<Integer> ans = new LinkedList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root==null){
            return ans;
        }
        solve(root);
        return ans;
    }

    public void solve(TreeNode now){
        if (now.left!=null) {
            solve(now.left);
        }
        ans.add(now.val);
        if (now.right!=null){
            solve(now.right);
        }
    }
}