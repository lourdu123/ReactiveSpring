package com.lourdu.datastructures;

class Node {

    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTreeInOrderPreOrderPostOrder {

    Node root;

    public static void main(String[] args) {

        BinaryTreeInOrderPreOrderPostOrder bt = new BinaryTreeInOrderPreOrderPostOrder();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);

        System.out.println("PreOrder traversal");
        bt.preOrder();
        System.out.println("PostOrder traversal");
        bt.postOrder();
        System.out.println("InOrder traversal");
        bt.inOrder();

        bt.mirror();
        System.out.println("mirror of the binary tree");
        bt.inOrder();
    }

    private void mirror() {

        mirror(root);
    }

    private void mirror(Node root2) {

        if (root2 == null) {
            return;
        }

        mirror(root2.left);
        mirror(root2.right);

        // swap right and left
        Node temp = null;
        temp = root2.right;
        root2.right = root2.left;
        root2.left = temp;
    }

    private void inOrder() {
        inOrder(root);
    }

    private void preOrder() {
        preOrder(root);
    }

    private void postOrder() {
        postOrder(root);
    }

    private void inOrder(Node root2) {

        if (root2 == null)
            return;

        inOrder(root2.left);
        System.out.println(root2.data); // for inorder sop is middle statement
        inOrder(root2.right);

    }

    private void postOrder(Node root2) {

        if (root2 == null)
            return;

        postOrder(root2.left);
        postOrder(root2.right);
        System.out.println(root2.data); // for postorder sop is last statement
    }

    private void preOrder(Node root2) {

        if (root2 == null)
            return;

        System.out.println(root2.data);  // for preorder sop is first statement
        preOrder(root2.left);
        preOrder(root2.right);
    }
}
