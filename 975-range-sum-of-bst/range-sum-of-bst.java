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
    public int rangeSumBST(TreeNode root, int low, int high) {
        ArrayList<Integer> list = new ArrayList<>();

        TreeNode temp = root;

        int sum = 0;

        traverse(root,list);

        for(int i=0; i<list.size(); i++){
            int element = list.get(i);

            if(element >= low && element <= high){
                sum += element;
            }
        }

        return sum;
    }

    private void traverse(TreeNode root, ArrayList<Integer> list){
        if(root != null){
            list.add(root.val);

            if(root.right != null){
                traverse(root.right,list);
            }

            if(root.left != null){
                traverse(root.left,list);
            }
        }
    }
}