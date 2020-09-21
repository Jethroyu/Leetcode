package problemset.question1038;

import template.TreeNode;

/**
 * @author shidu
 * @date 2020/9/21 10:22
 */

class Solution {
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if (root != null) {
            bstToGst(root.right);
            sum+=root.val;
            root.val = sum;
            bstToGst(root.left);
        }
        return root;
    }

}