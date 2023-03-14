/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans=0;
    public int sumNumbers(TreeNode root) {
        int val=0;
        sumRootToLeaf(root,0);
        return ans;
    }
    public void sumRootToLeaf(TreeNode root,int val){
        if(root==null) return;
        val*=10;
        val+=root.val;
        if(root.left==null&&root.right==null){
            ans+=val;
            return;
        }
        sumRootToLeaf(root.left,val);
        sumRootToLeaf(root.right,val);
    }
}