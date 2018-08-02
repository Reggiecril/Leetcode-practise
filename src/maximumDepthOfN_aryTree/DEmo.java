package maximumDepthOfN_aryTree;

import java.util.List;

/**
 * 
 * @author reggie
 *
 */
public class DEmo {
	/**
	 * Given a n-ary tree, find its maximum depth.
	 * 
	 * The maximum depth is the number of nodes along the longest path from the root
	 * node down to the farthest leaf node.
	 * 
	 * @param root
	 * @return
	 */
	public int maxDepth(Node root) {
		if (root == null)
			return 0;
		return depth(root) + 1;
	}

	private int depth(Node root) {
		if (root == null)
			return 0;
		int max = 0;
		for (Node node : root.children) {
			max = Math.max(max, depth(node) + 1);
		}
		return max;
	}
}

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