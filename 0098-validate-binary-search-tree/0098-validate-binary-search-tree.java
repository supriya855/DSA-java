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
//Inorder traversal and traverse through it
class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        int c=0;
        inorder(root ,list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)<list.get(i+1)){
                c++;
            }
        }
        return c==list.size()-1;
    }
    public void inorder(TreeNode root, List<Integer> list){
        if(root!=null){
            inorder(root.left,list);
            list.add(root.val);
            inorder(root.right,list);
        }
    }
}