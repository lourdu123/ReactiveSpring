package com.lourdu.datastructures;

import com.lourdu.Node6;

public class FindTheNodeWithMinimumValueInBST {

    static Node6 root;

    // static int[] arr = new int[1000];
    // static int len = 0 ;
    // static Set<Integer> keys = new HashSet<Integer>();

    public static void main(String[] args) {

        FindTheNodeWithMinimumValueInBST papbn = new FindTheNodeWithMinimumValueInBST();
        papbn.root = new Node6(10);
        papbn.root.left = new Node6(8);
        papbn.root.right = new Node6(12);
        papbn.root.left.left = new Node6(4);
        papbn.root.left.right = new Node6(10);
        papbn.root.right.left = new Node6(11);

        Node6 node = findMinElementInTree(root);
        System.out.println("min value:" + node.data);

        // Binary Search Tree Checking (for problems 13 and 14)
        //
        // This background is used by the next two problems: Given a plain
        // binary tree, examine the tree to determine if it meets the
        // requirement to be a binary search tree. To be a binary search tree,
        // for every node, all of the nodes in its left tree must be <= the
        // node, and all of the nodes in its right subtree must be > the node.
        // Consider the following four examples...
        // a. 5 -> TRUE
        // / \
        // 2 7
        //
        //
        // b. 5 -> FALSE, because the 6 is not ok to the left of the 5
        // / \
        // 6 7
        //
        //
        // c. 5 -> TRUE
        // / \
        // 2 7
        // /
        // 1
        //
        // d. 5 -> FALSE, the 6 is ok with the 2, but the 6 is not ok with the 5
        // / \
        // 2 7
        // / \
        // 1 6

        // If node elements are not arranged in BINARY SEARCH TREE(BST) order
        // then do the following programming.

    }

    private static Node6 findMinElementInTree(Node6 root2) {

        if (root2 == null) {
            return null;
        }

        if (root2.left == null) {
            return root2;
        }
        return findMinElementInTree(root2.left);
    }

}
