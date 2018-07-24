package convertSortedArrayToBinarySearchTree;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given an array where elements are sorted in ascending order, convert it to a
	 * height balanced BST.
	 * 
	 * Given the sorted array: [-10,-3,0,5,9],
	 * 
	 * One possible answer is: [0,-3,9,-10,null,5], which represents the following
	 * height balanced BST:
	 * 
	 * 0 / \ -3 9 / / -10 5
	 * 
	 * @param nums
	 * @return
	 */
	public TreeNode sortedArrayToBST(int[] nums) {
		return add(nums, 0, nums.length - 1);
	}

	private TreeNode add(int[] nums, int low, int high) {
		if (nums.length == 0 || nums == null)
			return null;
		if (low > high)
			return null;
		int mid = (high + low) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = add(nums, low, mid - 1);
		root.right = add(nums, mid + 1, high);
		return root;
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
