package hard;

import pojo.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Following the question of finding the diameter of a binary tree, now we need to print the diameter of the binary tree.
 * The diameter of a binary tree is the length of the longest path between any two nodes in the tree. This path may or may not pass through the root.
 */
public class PrintDiameterOfBinaryTree {
    int maxDiameter = 0;
    List<Integer> diameterPath = new ArrayList<>();

    public static class Tuple  {
        int height;
        List<Integer> path;
        public Tuple(int height, List<Integer> path) {
            this.height = height;
            this.path = path;
        }
    }

    public Tuple diameterRecursive(TreeNode root) {
        if (root == null) {
            return new Tuple(0, new ArrayList<>());
        }
        Tuple left = diameterRecursive(root.left);
        Tuple right = diameterRecursive(root.right);

        int currentHeight = Math.max(left.height,right.height) + 1;

        List<Integer> currentDeepestPath = new ArrayList<>();
        currentDeepestPath.add(root.val);

        if(left.height >= right.height) {
            currentDeepestPath.addAll(left.path);
        } else {
            currentDeepestPath.addAll(right.path);
        }

        int currentDiameter = left.height + right.height;

        if (currentDiameter > maxDiameter) {
            maxDiameter = currentDiameter;

            List<Integer> fullPath = new ArrayList<>();
            List<Integer> leftPathReversed = new ArrayList<>(left.path);
            Collections.reverse(leftPathReversed);
            fullPath.addAll(leftPathReversed);
            fullPath.add(root.val);
            fullPath.addAll(right.path);

            diameterPath = fullPath;
        }
        return new Tuple(currentHeight, currentDeepestPath);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        PrintDiameterOfBinaryTree pd = new PrintDiameterOfBinaryTree();
        pd.diameterRecursive(root);
        System.out.println("Diameter: " + pd.maxDiameter);
        System.out.println("Diameter Path: " + pd.diameterPath);
    }
}
