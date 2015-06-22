package com.clouway.objects.task5;

/**
 * Created by clouway on 15-5-18.
 */
public class DemoTree {
    static class User {

    }
    public static void main(String[] args) {
        HeterogeneousTree tree2 = new HeterogeneousTree();

        Cat cat = new Cat("Sisa");
        Dog dog = new Dog("Jack");
        Person person = new Person("Kristiqn");
        Integer integer = new Integer(2424646);
        Double doublen = new Double(2424645.4646);

        tree2.add(new User(), "training");
        tree2.add(cat, cat.getName());
        tree2.add(dog, dog.getName());
        tree2.add(person, person.getName());
        tree2.add(integer, integer.toString());
        tree2.add(doublen, doublen.toString());
        tree2.print();
        System.out.println();
    }
}
