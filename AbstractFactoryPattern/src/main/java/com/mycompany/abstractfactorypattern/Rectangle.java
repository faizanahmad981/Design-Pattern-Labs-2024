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
public class Rectangle implements Shape {
   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
      int width = 55; // Width of the rectangle
      int height = 8; // Height of the rectangle

      // Print the top line
      for (int i = 0; i < width; i++) {
         System.out.print("_");
      }
      System.out.println();

      // Print the sides
      for (int i = 0; i < height - 2; i++) {
         System.out.println("|" + " ".repeat(width - 2) + "|");
      }

      // Print the bottom line
      for (int i = 0; i < width; i++) {
         System.out.print("_");
      }
      System.out.println();
   }
}

