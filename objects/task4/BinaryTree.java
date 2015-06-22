package com.clouway.objects.task4;

/**
 * Created by clouway on 15-5-14.
 */
public class BinaryTree {
    Node root;

    public void searchElement(int val) {
        Node searchNode = search(val);
        if (searchNode != null) {
            System.out.println("Exist element " + val + " in tree");
        } else {
            System.out.println("Do not exist element " + val + " in tree");
        }

    }

    private Node search(int val) {
        if (root != null) {
            return findNode(root, new Node(val));
        }
        return null;
    }

    private Node findNode(Node search, Node node) {
        if (search == null) {
            return null;
        }
        if (search.data == node.data) {
            return search;
        } else {
            Node returnNode = findNode(search.leftChild, node);
            if (returnNode == null) {
                returnNode = findNode(search.rightChild, node);
            }
            return returnNode;
        }
    }

    public void add(int data) {
        Node nodeToAdd = new Node(data);
        if (root == null) {
            root = nodeToAdd;
        }
        addNode(root, nodeToAdd);
    }

    private void addNode(Node node, Node nodeToAdd) {
        if (node.data > nodeToAdd.data && node.leftChild == null) {
            node.parent = node;
            node.leftChild = nodeToAdd;

        } else if (node.data > nodeToAdd.data && node.leftChild != null) {
            addNode(node.leftChild, nodeToAdd);
        }

        if (node.data < nodeToAdd.data && node.rightChild == null) {
            node.parent = node;
            node.rightChild = nodeToAdd;
        } else if (node.data < nodeToAdd.data && node.rightChild != null) {
            addNode(node.rightChild, nodeToAdd);
        }
    }

    public void traverse() {
        if (root != null) {
                inOrderTraversal(root);
        }
    }

    private void inOrderTraversal(Node node) {
        if (node.leftChild != null) {
            inOrderTraversal(node.leftChild);
        }
        System.out.println(node.data);
        if (node.rightChild != null) {
            inOrderTraversal(node.rightChild);
        }
    }
}
