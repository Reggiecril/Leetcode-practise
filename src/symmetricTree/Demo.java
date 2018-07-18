package symmetricTree;

public class Demo {
	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		return isSymmetric(root.left, root.right);
	}

	private boolean isSymmetric(TreeNode q, TreeNode p) {
		if (q == null && p == null)
			return true;
		if (q == null || p == null)
			return false;
		return isSymmetric(q.left, p.right) && isSymmetric(q.right, p.left) && q.val == p.val;
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
