/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.contradodigital.composite;

/**
 *
 * @author Faizan
 */

public class Composite {
    public static void main(String[] args) {
        // Create a tree structure
        Leaf leaf = new Leaf();
        System.out.println("Client: I've created a sample component:");
        System.out.println(leaf.operation());

        Container tree = new Container();
        Container branch1 = new Container();
        branch1.addChild(new Leaf());
        branch1.addChild(new Leaf());

        Container branch2 = new Container();
        branch2.addChild(new Leaf());

        tree.addChild(branch1);
        tree.addChild(branch2);

        System.out.println("Client: I've created a composite component:");
        System.out.println(tree.operation());
    }
}
