package com.lourdu.BinarySearchTree;

public class MyBinarySearchTree<T> {

    private MyTreeNode<T> root;

    public MyTreeNode<T> getRoot() {
        return root;
    }

    public void setRoot(MyTreeNode<T> root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return "MyBinarySearchTree [root=" + root + "]";
    }

    public static void main(String[] args) {

        MyBinarySearchTree bst = new MyBinarySearchTree<>();

        bst.add(20);
        System.out.println(bst.toString());

        bst.add(15);
        System.out.println(bst.toString());

        bst.add(10);
        System.out.println(bst.toString());

        bst.add(18);
        bst.add(16);
        bst.add(19);
        bst.add(17);
        bst.add(25);
        System.out.println(bst.toString());

        System.out.println(bst.find(19));
        System.out.println(bst.find(30));

        // System.out.println("display the BST");
        // bst.display();

    }

    private void display() {
        if (root == null) {
            return;
        }
        else {

        }

    }

    private boolean find(T element) {

        boolean isAvailable = false;

        if (root.getData() == element) {
            isAvailable = true;
        }

        MyTreeNode<T> temp = root;
        while (temp != null) {

            if ((int) element < (int) temp.getData()) {

                if (temp.getData() == element) {
                    isAvailable = true;
                }
                temp = temp.getLeft();

            }
            else {

                if (temp.getData() == element) {
                    isAvailable = true;
                }
                temp = temp.getRight();
            }

        }

        return isAvailable;
    }

    private void add(T element) {

        MyTreeNode<T> n = new MyTreeNode<>();
        n.setData(element);

        if (root == null) {
            root = n;
        }
        else {
            MyTreeNode<T> temp = root;
            while (true) {

                if ((int) element < (int) temp.getData()) {
                    MyTreeNode<T> leftValue = temp.getLeft();
                    if (leftValue == null) {
                        temp.setLeft(n);
                        break;  // breaks while loop
                    }
                    temp = temp.getLeft();
                }
                else {
                    MyTreeNode<T> rightValue = temp.getRight();
                    if (rightValue == null) {
                        temp.setRight(n);
                        break;  // breaks while loop
                    }
                    temp = temp.getRight();
                }

            }
        }

    }
}
