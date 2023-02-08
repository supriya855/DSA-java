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
    List<Integer> list= new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st= new Stack<>();
        while(true){
            if(root!=null){
                st.push(root);
                root=root.left;   
            } 
            else{
                if(st.isEmpty())
                    break;
                else{
                    root=st.pop();
                    list.add(root.val);
                    root=root.right;
                }
            }
        }
       return list.get(k-1);
        
    }
}