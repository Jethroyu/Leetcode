package problemset.question538;

/**
 * @author shidu
 * @date 2020/9/21 10:12
 */

import template.TreeNode;

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
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            sum+=root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }

}