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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return balanced(root)!=-1;
        
    }
    public int balanced(TreeNode root){
    if(root==null){
        return 0;
    }    
        
        int l=balanced(root.left);
        if(l==-1) return -1;
        int r=balanced(root.right);
        if(r==-1) return -1;
      
        if(Math.abs(l-r)>1) return -1;
        return 1+Math.max(l,r);
    }
}
    
