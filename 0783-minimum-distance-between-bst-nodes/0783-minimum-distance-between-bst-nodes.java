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
    List<Integer> list = new ArrayList<>();
    public int min=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        System.out.println(list);
       for(int i=0;i<list.size()-1;i++){
           int n1=list.get(i);
           int n2=list.get(i+1);
          min=Math.min(min,(Math.abs(n1-n2)));
       }
        return min;
    }
    public void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
        
    }
}