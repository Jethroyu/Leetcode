package Solution.question110;

import template.TreeNode;

class Solution {
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        DFS(root,1);
        return flag;
    }

    public int DFS(TreeNode now,int dep){
        if (!flag)//如果已经查出来并非是平衡树，进行剪断
            return -1;
        if(now == null){
            return dep;
        }
        else{
            if (Math.abs(DFS(now.left,dep+1)-DFS(now.right,dep+1))>1){
                flag = false;
            }
            return Math.max(DFS(now.left,dep+1),DFS(now.right,dep+1));
        }
    }
}