import java.util.ArrayList;
import java.util.List;

/**
 * @author reggie
 *
 *
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *
 *     TreeNode(int x) {
 *         val = x;
 *     }
 * }
 */
public class binaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null)
            return list;
        inOrder(list,root);

        return list;
    }

    private void inOrder(List<Integer> list,TreeNode node){
        if(node!=null){
            if(node.left!=null){
                inOrder(list,node.left);
            }
            list.add(node.val);
            if(node.right!=null){
                inOrder(list,node.right);
            }

        }else
            return;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
