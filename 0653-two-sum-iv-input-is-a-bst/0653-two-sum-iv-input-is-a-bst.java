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
        int s=0;
        int e=l.size()-1;
        while(s<e){
            if(l.get(s)+l.get(e)==k){
                return true;
            }
            if(l.get(s)+l.get(e)<k) s++;
            else e--;
            
            
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