/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int left = leftHeight(root) + 1;
        int right = rightHeight(root) + 1;
        if(left == right){
            return (2<<(left-1))-1;
        }
        else{
            return countNodes(root.left) + countNodes(root.right) + 1;
        }
    }
    
    public int leftHeight(TreeNode node){
        if(node == null){
            return 0;
        }
        
        int height = 0;
        while(node.left != null){
            height++;
            node = node.left;
        }
        return height;
    }
    
    public int rightHeight(TreeNode node){
        if(node == null){
            return 0;
        }
        int height = 0;
        while(node.right != null){
            height++;
            node = node.right;
        }
        return height;
    }
}