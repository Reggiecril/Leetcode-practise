package binaryTreePaths;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given a binary tree, return all root-to-leaf paths.
	 * 
	 * Note: A leaf is a node with no children.
	 * Example:

Input:

   1
 /   \
2     3
 \
  5

Output: ["1->2->5", "1->3"]

Explanation: All root-to-leaf paths are: 1->2->5, 1->3

	 * 
	 * @param root
	 * @return
	 */
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new ArrayList<>();
		if (root != null)
			path(root, "", list);
		return list;
	}

	private void path(TreeNode node, String string, List<String> list) {

		if (node.right == null && node.left == null)
			list.add(string + node.val);
		string += node.val + "->";
		if (node.left != null)
			path(node.left, string, list);
		if (node.right != null)
			path(node.right, string, list);

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
