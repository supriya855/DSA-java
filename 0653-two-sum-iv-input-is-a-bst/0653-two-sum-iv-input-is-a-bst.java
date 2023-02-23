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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> l=new ArrayList<>();
        inorder(root,l);
        for(int i=0;i<l.size();i++){
            for(int j=i+1;j<l.size();j++){
            if(l.get(i)+l.get(j)==k){
                return true;
             }
            }
        }
        return false;
    }
    public void inorder(TreeNode root, ArrayList<Integer> l){
        if(root!=null){
            inorder(root.left,l);
            l.add(root.val);
            inorder(root.right,l);
            
        }
    }
}