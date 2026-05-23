package hard;

import pojo.TreeNode;

public class DiameterOfBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        DiameterCalculator dc = new DiameterCalculator();

        System.out.println(dc.diameterOfBinaryTree(root));
    }

    public static class DiameterCalculator{
        int result = 0;
        public DiameterCalculator() {}
        int diameterOfBinaryTree(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int leftDiameter = diameterOfBinaryTree(root.left);
            int rightDiameter = diameterOfBinaryTree(root.right);

            int height = Math.max(leftDiameter, rightDiameter) + 1;
            int currentDepth = Math.max(height, leftDiameter + rightDiameter + 1);
            result = Math.max(result, currentDepth);
            return height;
        }
    }
}
