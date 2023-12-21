class Solution {
    int maxValue;
    public int maxPathSum(TreeNode root) {
        maxValue=Integer.MIN_VALUE;
        maxPathDown(root);
        return maxValue;   
    }
    public int maxPathDown(TreeNode root){
        if(root==null) return 0;
        int left =Math.max(0,maxPathDown(root.left));
        int right=Math.max(0,maxPathDown(root.right));
        maxValue=Math.max(maxValue,left+right+root.val);//in these left right root val
        return Math.max(left,right)+root.val;// taking a max from left or right then adding it returning to a respective left and right value
    }
}
