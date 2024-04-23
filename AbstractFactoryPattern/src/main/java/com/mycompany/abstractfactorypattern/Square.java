/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abstractfactorypattern;

/**
 *
 * @author Rana Saim Ali
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
        int size = 10; // Size of the square

        // Print the top line
        for (int i = 0; i < size; i++) {
            System.out.print("_");
        }
        System.out.println();

        // Print the sides
        for (int i = 0; i < size - 7; i++) {
            System.out.println("|" + " ".repeat(size - 2) + "|");
        }

        // Print the bottom line
        for (int i = 0; i < size; i++) {
            System.out.print("_");
        }
        System.out.println();
    }
}
