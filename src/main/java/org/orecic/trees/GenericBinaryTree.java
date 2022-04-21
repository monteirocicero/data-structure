package org.orecic.trees;

public abstract class GenericBinaryTree {

    private Node root;

    public GenericBinaryTree(Object data) {
        setRoot(new Node(data));
    }

    public GenericBinaryTree() {
        setRoot(null);
    }

    public void insertLeft(Node node, Object data) {
        if (node != null && node.getLeft() == null) {
            node.setLeft(new Node(data));
        }
    }

    public void insertRight(Node node, Object data) {
        if (node != null && node.getRight() == null) {
            node.setRight(new Node(data));
        }
    }

    public void preOrder() {
        preOrder(getRoot());
    }

    protected void preOrder(Node node) {
        if (node == null) return;

        System.out.println(node.getData() + " ");

        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    public void inOrder() {
        inOrder(getRoot());
    }

    protected void inOrder(Node node) {
        if (node == null) return;

        inOrder(node.getLeft());

        System.out.println(node.getData() + " ");

        inOrder(node.getRight());
    }

    public void posOrder() {
        posOrder(getRoot());
    }

    protected void posOrder(Node node) {
        if (node == null) return;

        posOrder(node.getLeft());
        posOrder(node.getRight());

        System.out.println(node.getData() + " ");
    }

    public void print(int mode) {
        if (mode == 1) {
            preOrder();
        } else if (mode == 2) {
            inOrder();
        } else if (mode == 3) {
            posOrder();
        }
    }

    public boolean isEmpty() {
        return getRoot() == null;
    }

    public Object getData() {
        if (!isEmpty()) {
            return getRoot().getData();
        }
        return null;
    }

    public Node getLeft() {
        if (!isEmpty()) {
            return getRoot().getLeft();
        }
        return null;
    }

    public Node getRight() {
        if (!isEmpty()) {
            return getRoot().getRight();
        }
        return null;
    }

    public void setData(Object o) {
        if (!isEmpty()) {
            getRoot().setData(o);
        }
    }



    protected Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

}
