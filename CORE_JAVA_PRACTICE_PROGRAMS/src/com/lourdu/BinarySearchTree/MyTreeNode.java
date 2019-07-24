package com.lourdu.BinarySearchTree;

public class MyTreeNode<T> {

    private T data;
    private MyTreeNode<T> left;
    private MyTreeNode<T> right;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MyTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(MyTreeNode<T> left) {
        this.left = left;
    }

    public MyTreeNode<T> getRight() {
        return right;
    }

    public void setRight(MyTreeNode<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "MyTreeNode [data=" + data + ", left=" + left + ", right=" + right + "]";
    }

}
