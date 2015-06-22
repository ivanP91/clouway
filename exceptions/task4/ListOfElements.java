package com.clouway.exceptions.task4;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by clouway on 15-6-4.
 */
public class ListOfElements {
    private List<Object> list = new ArrayList<Object>();
    private int i = 0;
    private final int max = 3;

    public void add(Object obj) {
        try {
            if (i < max) {
                list.add(i, obj);
                this.i++;
            } else if (i >= max) {
                throw new Exception("list size is " + max + " we can't to write more elements");
            }
        } catch (Exception ex) {
            System.out.println("Exception: List is full! It is impossible to add more elements!! " + ex.getMessage());

        }
    }

    public void remove() {
        try {
            if (!list.isEmpty()) {
                list.remove(i - 1);
                i--;
            }else{
                throw new Exception("empty list");
            }
        } catch (Exception ex) {
            System.out.println("Can't remove from "+ex.getMessage());
        }

    }

    public void printAllElements() {
        for (int j = 0; j < i; j++) {
            System.out.println(list.get(j));
        }
    }
}
