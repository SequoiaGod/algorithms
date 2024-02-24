package dataStructure.BinaryTree.BinaryTreePreorderTraversal144;

import dataStructure.BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) return result;
        traversal(root, result);
        return result;
    }

    public void traversal(TreeNode root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        traversal(root.left, result);
        traversal(root.right, result);

    }
}