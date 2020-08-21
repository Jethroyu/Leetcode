package Solution.question111;

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


//简单的搜索就行 BFS DFS都可以
    //此处用了DFS
    //检索到叶子节点之后 与全局最小值对比
    //注意空树
class Solution {
    int min_dep = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        //空树作为0深度
        if (root == null)
            return 0;
        DFS(root,1);
        return min_dep;
    }

    void DFS(TreeNode now,int dep){
        if (now.left == null && now.right == null) {
            if (dep < min_dep) {
                min_dep = dep;
            }
            return;
        }

        if (now.left!=null)
            DFS(now.left,dep+1);
        if (now.right!=null)
            DFS(now.right,dep+1);
    }
}