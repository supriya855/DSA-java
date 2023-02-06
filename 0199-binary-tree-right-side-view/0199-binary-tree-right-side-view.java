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
/* The main aim is you have too look from right side what are nodes you are seeing you have to print that 
1. Intially if we oeserve i.e is the lastnode of every level
2. we can do this by using recursive approach and level order i.e is iterative
3. But the suitable one is recursion why because it takes TC is O(n) but SC O(Height) where as level order takes O(N) and Sc O(n)
4. In recursive approch we are using reversed preorder
5. question where we can store the rightview elements
6. here comes the technique that we can use data structures and we are level intially 0 it increses as we are moving left and right we are adding into our ds if (level==ds.size())
*/
class Solution {
    
    public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ds = new ArrayList<>();
            int level=0;
            rightView(root,level,ds);
             return ds;
       
    }
    public void rightView(TreeNode root,int level,List<Integer> ds){
        if(root==null)
            return;
        
        if(level==ds.size())
            ds.add(root.val);
        rightView(root.right,level+1,ds);
        rightView(root.left,level+1,ds);
       
    }
}