package 二叉树的镜像;

public class Demo {
    /**
     *操作给定的二叉树，将其变换为源二叉树的镜像。
     *
     * 二叉树的镜像定义：源二叉树
     *     	    8
     *     	   /  \
     *     	  6   10
     *     	 / \  / \
     *     	5  7 9 11
     *     	镜像二叉树
     *     	    8
     *     	   /  \
     *     	  10   6
     *     	 / \  / \
     *     	11 9 7  5
     * @param root
     */
    public void Mirror(TreeNode root) {
        if(root==null)return;
        if(root.left==null){
            Mirror(root.right);
            root.left=root.right;
            root.right=null;
        }else if(root.right==null){
            Mirror(root.left);
            root.right=root.left;
            root.left=null;
        }else{
            Mirror(root.right);
            Mirror(root.left);
            TreeNode temp=root.right;
            root.right=root.left;
            root.left=temp;

        }
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}