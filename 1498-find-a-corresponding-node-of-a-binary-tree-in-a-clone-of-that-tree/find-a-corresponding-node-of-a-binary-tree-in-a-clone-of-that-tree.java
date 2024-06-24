/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        ArrayList<TreeNode> list = new ArrayList<>();
        ArrayList<TreeNode> targetTree = new ArrayList<>();

        traverse(list,cloned);
        traverse(targetTree,target);

        for(int i=0; i<list.size(); i++){
            TreeNode element = list.get(i);
            ArrayList<TreeNode> clonedTree = new ArrayList<>();
            traverse(clonedTree,element);

            if(arrayListEquals(targetTree,clonedTree)){
                return element;
            }
        }

        return null;
    }

    private void traverse(ArrayList<TreeNode> list, TreeNode root){
        if(root != null){
            list.add(root);

            if(root.right != null){
                traverse(list,root.right);
            }

            if(root.left != null){
                traverse(list,root.left);
            }
        }
    }

    private boolean arrayListEquals(ArrayList<TreeNode> list1,ArrayList<TreeNode> list2){
        int size1 = list1.size();
        int size2 = list2.size();

        if(size1 != size2){
            return false;
        }
        else{
            boolean result = true;
            for(int i=0; i<size1; i++){
                if(list1.get(i).val != list2.get(i).val){
                    result = false;
                    return result;
                }
            }
            return result;
        }
    }
}