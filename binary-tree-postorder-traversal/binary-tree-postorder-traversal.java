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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> st1= new Stack<>();
        Stack<TreeNode> st2= new Stack<>();
        List<Integer> l= new ArrayList<>();
        if(root!=null)
            st1.add(root);
        while(!st1.isEmpty()){
            root=st1.pop();
            st2.add(root);
            if(root.left!=null){// we are adding left 1st to stack to get the right is first at st1 
                st1.add(root.left);
            }
            if(root.right!=null){
                 st1.add(root.right);
            }
        }
        System.out.println(st2.size());
        while(!st2.isEmpty()){
            TreeNode curr=st2.peek();
            l.add(curr.val);
            st2.pop();
            
        }
        return l;
        
    }
}