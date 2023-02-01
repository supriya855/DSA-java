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
    public boolean isSymmetric(TreeNode root) {
      return root==null||symetric(root.left,root.right);// checking if root is null return true or checking symetric
           
    }
    public boolean symetric(TreeNode left,TreeNode right){
        if(left==null||right==null){// if any left or right is null check if both are equal
            return left==right;
        }
        if(left.val!=right.val) return false;
        return symetric(left.left,right.right)&&symetric(left.right,right.left);
    }
}
        
   