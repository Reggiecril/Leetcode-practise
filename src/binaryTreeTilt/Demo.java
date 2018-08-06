package binaryTreeTilt;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given a binary tree, return the tilt of the whole tree.
	 * 
	 * The tilt of a tree node is defined as the absolute difference between the sum
	 * of all left subtree node values and the sum of all right subtree node values.
	 * Null node has tilt 0.
	 * 
	 * The tilt of the whole tree is defined as the sum of all nodes' tilt.
	 * 
	 * @param root
	 * @return
	 */
	public int findTilt(TreeNode root) {
		if (root == null)
			return 0;
		return Math.abs(sum(root.left) - sum(root.right)) + findTilt(root.left) + findTilt(root.right);
	}

	private int sum(TreeNode root) {
		if (root == null)
			return 0;
		return root.val + sum(root.left) + sum(root.right);
	}

	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
