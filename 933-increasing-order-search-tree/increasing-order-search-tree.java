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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<>();

        traverse(list,root);

        for(int i=0; i<list.size()-1; i++){
            for(int j=i; j<list.size(); j++){
                TreeNode node1 = list.get(i);
                TreeNode node2 = list.get(j);
                node1.left = null;
                node1.right = null;
                node2.left = null;
                node2.right = null;
                if(node1.val > node2.val){
                    swap(list,i,j);
                }
            }
        }

        TreeNode newRoot = list.get(0);
        TreeNode temp = newRoot;

        for(int i=1; i<list.size(); i++){
            temp.right = list.get(i);
            temp = temp.right;
        }

        return newRoot;
    }

    private void traverse(ArrayList<TreeNode> list,TreeNode root){
        if(root != null){
            list.add(root);

            if(root.left != null){
                traverse(list,root.left);
            }

            if(root.right != null){
                traverse(list,root.right);
            }
        }
    }

    private void swap(ArrayList<TreeNode> list,int index1,int index2){
        TreeNode temp = list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,temp);
    }
}