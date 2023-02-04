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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);//traverse through the left side of a tree
        TreeNode right=lowestCommonAncestor(root.right,p,q);//traverse through the right side of a tree
        if(left==null){
            // while return back we are checking
            return right;
        }
        if(right==null)
            return left;
        else
            return root;
        // for the below example lca(7,8);
/*     1
     /   \
    2     3
        / \
       4   5
       /   /\
      8   6  7
      
*/
// here using left we are 2  and its left and right null 
    }
}