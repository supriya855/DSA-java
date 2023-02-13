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
    public TreeNode bstFromPreorder(int[] preorder) {
        int[] inorder= new int[preorder.length];
        for(int i=0;i<preorder.length;i++){
            inorder[i]=preorder[i];
        }
        Arrays.sort(inorder);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode root= buildBST(preorder,inorder,0,preorder.length-1,0,inorder.length-1, map);
        return root;
        
    }
    public TreeNode buildBST(int[] preorder,int[] inorder,int preStart,int preEnd,int inStart,int inEnd,  Map<Integer,Integer> map  ){
        if(preStart>preEnd||inStart>inEnd) return null;
    TreeNode root= new TreeNode(preorder[preStart]);
        int inRoot = map.get(root.val);
        int numsLeft=inRoot-inStart;
        root.left= buildBST(preorder,inorder,preStart+1,preEnd,inStart,inRoot-1,map);
        root.right=buildBST(preorder,inorder,preStart+numsLeft+1,preEnd,inRoot+1,inEnd,map);
        return root;
    }
}