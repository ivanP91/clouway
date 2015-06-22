package com.clouway.objects.task5;

/**
 * Created by clouway on 15-5-14.
 */
public class Node {
    String data;
    Node leftChild;
    Node rightChild;
    Node parent;
    Object object;

    public Node() {
    }

    public Node(Object object, String data) {
        this.data = data;
        this.object=object;
    }
    public Node(String data){
        this.data=data;
    }
}
