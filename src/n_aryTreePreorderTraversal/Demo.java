package n_aryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	class Node {
		public int val;
		public List<Node> children;

		public Node() {
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	};

	/**
	 * Given an n-ary tree, return the preorder traversal of its nodes' values.
	 * 
	 * For example, given a 3-ary tree:
	 * 
	 * 
	 * 
	 * 
	 * Return its preorder traversal as: [1,3,5,6,2,4].
	 * 
	 * @param root
	 * @return
	 */
	public List<Integer> preorder(Node root) {
		List<Integer> list = new ArrayList<>();
		order(root, list);
		return list;
	}

	private void order(Node root, List<Integer> list) {
		if (root == null)
			return;
		list.add(root.val);
		for (Node child : root.children) {

			order(child, list);

		}

	}
}
