package sameTree;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * 
	 * Given two binary trees, write a function to check if they are the same or
	 * not.
	 * 
	 * Two binary trees are considered the same if they are structurally identical
	 * and the nodes have the same value.
	 * 
	 * Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
	 * @param p
	 * @param q
	 * @return
	 */
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		if (p == null || q == null)
			return false;
		if (isSameTree(p.left, q.left) && isSameTree(p.right, q.right) && p.val == q.val)
			return true;
		else
			return false;
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
