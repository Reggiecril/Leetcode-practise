package sumRootToLeafNumbers;

public class Demo {
    /**
     * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
     *
     * An example is the root-to-leaf path 1->2->3 which represents the number 123.
     *
     * Find the total sum of all root-to-leaf numbers.
     *
     * Note: A leaf is a node with no children.
     *
     * Input: [4,9,0,5,1]
     *     4
     *    / \
     *   9   0
     *  / \
     * 5   1
     * Output: 1026
     * Explanation:
     * The root-to-leaf path 4->9->5 represents the number 495.
     * The root-to-leaf path 4->9->1 represents the number 491.
     * The root-to-leaf path 4->0 represents the number 40.
     * Therefore, sum = 495 + 491 + 40 = 1026.
     *
     * @param root
     * @return
     */
    public int sumNumbers(TreeNode root){
        if(root.right==null&&root.left==null){
            return root.val;
        }
        if(root.left==null){
            root.right.val+=root.val*10;
            return sumNumbers(root.right);
        }else if(root.right==null){
            root.left.val+=root.val*10;
            return sumNumbers(root.left);
        }else{
            root.left.val+=root.val*10;
            root.right.val+=root.val*10;
            return sumNumbers(root.left)+sumNumbers(root.right);
        }

    }
}

  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
