package com.clouway.objects.task4;

/**
 * Created by clouway on 15-5-14.
 */
public class BinaryTreeTest {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(55);
        tree.add(21);
        tree.add(43);
        tree.add(85);
        tree.add(76);
        tree.add(5);
        tree.add(90);
        tree.add(9);
        tree.traverse();
        tree.searchElement(55);
    }
}
