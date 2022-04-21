package org.orecic.trees;

public class Node {

    protected Object data;
    protected Node left, right;

    public Node() {
        this.data = null;
        left = right = null;
    }

    public Node(Object data) {
        this.data = data;
        left = right = null;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "TwoChildNode{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
