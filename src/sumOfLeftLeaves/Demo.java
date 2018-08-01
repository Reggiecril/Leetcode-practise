package sumOfLeftLeaves;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Find the sum of all left leaves in a given binary tree.
	 * 
	 * Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
	 * @param root
	 * @return
	 */
	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null)
			return 0;
		return leftLeaves(root);
	}

	private int leftLeaves(TreeNode root) {

		int count = 0;
		if (root.left != null) {
			if (root.left.left == null && root.left.right == null)
				count += root.left.val;
			count += leftLeaves(root.left);

		}
		if (root.right != null)
			count += leftLeaves(root.right);

		return count;
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
