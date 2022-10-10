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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int count = 0;
        while(!q.isEmpty()){
            count++; // increment level
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode node = q.remove();
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
                list.add(node.val);
            }
            if(count % 2 == 0) Collections.reverse(list); // reverse level list alternatively
            res.add(list);
        }
        return res;
    }

    }
