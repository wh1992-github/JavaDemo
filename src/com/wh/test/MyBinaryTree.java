
package com.wh.test;

public class MyBinaryTree {
    class TreeNode {
        int key;
        String data;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int a, String d) {
            this.key = a;
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    public TreeNode rootNode;

    public MyBinaryTree() {
        rootNode = new TreeNode(1, "A");
    }

    public static void main(String[] args) {
        MyBinaryTree binaryTree = new MyBinaryTree();
        binaryTree.createTree(binaryTree.rootNode);
        binaryTree.syso(binaryTree.rootNode);
    }

    public void syso(TreeNode root) {
        if (root != null) {
            syso(root.left);
            System.out.println(root.key + "--" + root.data);
            syso(root.right);
        }

    }

    public void createTree(TreeNode root) {
        TreeNode bNode = new TreeNode(2, "B");
        TreeNode cNode = new TreeNode(3, "C");
        TreeNode dNode = new TreeNode(4, "D");
        TreeNode eNode = new TreeNode(5, "E");
        root.left = bNode;
        root.right = cNode;
        root.left.left = dNode;
        root.left.right = eNode;
    }

    public int size(TreeNode subTree) {
        if (subTree == null) {
            return 0;
        } else {
            return 1 + size(subTree.left)
                    + size(subTree.right);
        }
    }
}
