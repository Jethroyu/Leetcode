package problemset.question530;

/**
 * @author shidu
 * @date 2020/10/12 13:17
 */

import template.TreeNode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/**
 * 树转成数组
 * 然后排序
 * 然后求挨着的两个值的差值，得差值的最小值
 */
class Solution {
    int min = Integer.MAX_VALUE;
    ArrayList<Integer> arrayList = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        DFS(root);
        Collections.sort(arrayList);
        for (int i = 1; i < arrayList.size(); i++){
            min = Math.min(min,arrayList.get(i)-arrayList.get(i-1));
        }
        return min;
    }
    void DFS(TreeNode now){
        arrayList.add(now.val);
        if (now.left != null){
            DFS(now.left);
        }
        if (now.right!=null){
            DFS(now.right);
        }
    }
}