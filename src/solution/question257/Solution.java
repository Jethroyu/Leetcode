package solution.question257;

/**
 * @author shidu
 * @date 2020/9/4 14:05
 */

import template.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<String> ans = new LinkedList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return new LinkedList<>();
        }
        DFS(root,new StringBuffer());
        return ans;
    }

    public void DFS(TreeNode now, StringBuffer str){
        if (now.right == null && now.left == null){
            str.append(now.val);
            ans.add(str.toString());
            return;
        }
        else {
            str.append(now.val+"->");
            if (now.left != null) {
                DFS(now.left,new StringBuffer(str));
            }
            if (now.right != null){
                DFS(now.right,new StringBuffer(str));
            }
        }
    }
}