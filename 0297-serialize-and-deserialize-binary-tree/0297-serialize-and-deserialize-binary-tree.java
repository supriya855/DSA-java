/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    String ser = "";
    int pos=0;
    public String serialize(TreeNode root) {
        preorder(root);
        System.out.println(ser);
        return ser;// whatever result we are getting by performing preorder we are paasing to deserialize to again construct the tree
    }
    public void preorder(TreeNode root){
        if(root == null) {
            ser+="N";
            return;
        }  
        ser+=root.val;
        ser+=',';
        preorder(root.left);
        preorder(root.right);
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.charAt(pos) == 'N'){ 
            pos++;
            return null;
        }
        String res="";
        while(data.charAt(pos) != ','){
            res+=String.valueOf(data.charAt(pos++));
        }
        pos++;
        System.out.println(res);
        TreeNode root = new TreeNode(Integer.parseInt(res));
        root.left = deserialize(data);
        root.right = deserialize(data);
        return root;
    }
}



// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));