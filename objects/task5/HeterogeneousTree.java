package com.clouway.objects.task5;

/**
 * Created by clouway on 15-5-18.
 */
public class HeterogeneousTree {
    private Node root;

    /**
     * Adds the provided object, associated with the provided key to the tree. The provided
     * key is used for determination where element to be placed in the tree or where there is an existing
     * element in the tree.
     * <p/>
     *
     * @param object the object to be added
     * @param key the associated key.
     */
    public void add(Object object, String key) {
        Node nodeToAdd = new Node(object, key);
        if (root == null) {
            root = nodeToAdd;
            root.object = object;
        }
        addNode(root, nodeToAdd, object);
    }


    /**
     * Printing root and check if there is children
     */
    public void print() {
        if (root != null) {
            printTree(root);
        }
    }


    private void addNode(Node node, Node nodeToAdd, Object object) {
        if (nodeToAdd.data.compareTo(node.data) < 0 && node.leftChild == null) {
            node.parent = node;
            node.leftChild = nodeToAdd;
            node.object = object;
        } else if (nodeToAdd.data.compareTo(node.data) < 0 && node.leftChild != null) {
            addNode(node.leftChild, nodeToAdd, object);
        }
        if (nodeToAdd.data.compareTo(node.data) > 0 && node.rightChild == null) {
            node.parent = node;
            node.rightChild = nodeToAdd;
            node.object = object;
        } else if (nodeToAdd.data.compareTo(node.data) > 0 && node.rightChild != null) {
            addNode(node.rightChild, nodeToAdd, object);
        }
    }

    private void printTree(Node node) {
        if (node.leftChild != null) {
            printTree(node.leftChild);
        }
        System.out.println(node.data);
        if (node.rightChild != null) {
            printTree(node.rightChild);
        }
    }

    public Node search(String key) {
        if (root != null) {
            return findNode(root, new Node(key));
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
    public void find(String val) {
        Node searchNode = search(val);
        if (searchNode != null) {
            System.out.println("Exist element whit name " + val + " in tree");
        } else {
            System.out.println("Do not exist element whit name" + val + " in tree");
        }
    }

}
