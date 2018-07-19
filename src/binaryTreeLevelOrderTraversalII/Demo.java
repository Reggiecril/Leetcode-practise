package binaryTreeLevelOrderTraversalII;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Demo {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		if (root == null)
			return new LinkedList<>();
		LinkedList<List<Integer>> list = new LinkedList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> inList = new LinkedList<>();
			for (int i = 0; i < size; i++) {
				TreeNode cur = queue.remove();
				inList.add(cur.val);
				if (cur.left != null)
					queue.add(cur.left);
				if (cur.right != null)
					queue.add(cur.right);

			}
			list.addFirst(inList);
		}
		return list;

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
