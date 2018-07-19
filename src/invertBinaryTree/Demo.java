package invertBinaryTree;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Invert a binary tree.
	 * 
Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
	 * 
	 * @param root
	 * @return
	 */
	public TreeNode invertTree(TreeNode root) {
		if (root == null)
			return null;
		TreeNode leftNode = root.left;
		root.left = invertTree(root.right);
		root.right = invertTree(leftNode);
		return root;
	}
	  public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		     TreeNode(int x) { val = x; }
		  }
}
