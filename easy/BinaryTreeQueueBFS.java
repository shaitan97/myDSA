package easy;

import pojo.TreeNode;

public class BinaryTreeQueueBFS {
    public static void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            System.out.print(currentNode.left + " ");
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
        }
    }

    public static void main(String[] args) {
        //      5
        //     / \
        //   12   13
        //   /  \    \
        //  7    14   2
        // / \  /  \  / \
        //17 23 27 3  8  11

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(12);
        root.right = new TreeNode(13);

        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(14);

        root.right.right = new TreeNode(2);

        root.left.left.left = new TreeNode(17);
        root.left.left.right = new TreeNode(23);

        root.left.right.left = new TreeNode(27);
        root.left.right.right = new TreeNode(3);

        root.right.right.left = new TreeNode(8);
        root.right.right.right = new TreeNode(11);

        levelOrderTraversal(root);
    }
}
