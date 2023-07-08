public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public int minDiffInBST(TreeNode root) {
        int min = Integer.MAX_VALUE;
        TreeNode deepest;
        if (root.left != null) {
            deepest = root.left;
            while (deepest.right != null) deepest = deepest.right;
            min = Integer.min(min, root.val - deepest.val);
            min = Integer.min(min, minDiffInBST(root.left));
        }
        if (root.right != null) {
            deepest = root.right;
            while (deepest.left != null) deepest = deepest.left;
            min = Integer.min(min, deepest.val - root.val);
            min = Integer.min(min, minDiffInBST(root.right));
        }
        return min;
    }
}