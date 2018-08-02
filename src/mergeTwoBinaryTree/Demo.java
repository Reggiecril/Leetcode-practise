package mergeTwoBinaryTree;


/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given two binary trees and imagine that when you put one of them to cover the
	 * other, some nodes of the two trees are overlapped while the others are not.
	 * 
	 * You need to merge them into a new binary tree. The merge rule is that if two
	 * nodes overlap, then sum node values up as the new value of the merged node.
	 * Otherwise, the NOT null node will be used as the node of new tree.
	 * 
	 * Example 1:
Input: 
	Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                  
Output: 
Merged tree:
	     3
	    / \
	   4   5
	  / \   \ 
	 5   4   7
	 * 
	 * @param t1
	 * @param t2
	 * @return
	 */
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		TreeNode root = new TreeNode(0);
		if (t1 == null && t2 == null) {
			return null;
		} else if (t1 == null && t2 != null) {
			root.val = t2.val;
			root.left = t2.left;
			root.right = t2.right;
			return root;
		} else if (t1 != null && t2 == null) {
			root.val = t1.val;
			root.left = t1.left;
			root.right = t1.right;
			return root;
		} else {
			root.val = t1.val + t2.val;
			root.left = mergeTrees(t1.left, t2.left);
			root.right = mergeTrees(t1.right, t2.right);
			return root;
		}
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
