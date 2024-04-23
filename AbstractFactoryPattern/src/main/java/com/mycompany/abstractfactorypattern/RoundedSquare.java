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
public class RoundedSquare implements Shape {
   @Override
   public void draw() {
      System.out.println("Inside RoundedSquare::draw() method.");
      int size = 20; // Size of the square
      int cornerSize = 2; // Size of the rounded corners

      // Print the top line
      System.out.print(" ");
      for (int i = 0; i < size - 2 * cornerSize; i++) {
         System.out.print("_");
      }
      System.out.println(" ");

      // Print the top rounded corners
      for (int i = 0; i < cornerSize; i++) {
         System.out.print("/");
      }
      for (int i = 0; i < size - 2 * cornerSize; i++) {
         System.out.print(" ");
      }
      for (int i = 0; i < cornerSize; i++) {
         System.out.print("\\");
      }
      System.out.println();

      // Print the sides
      for (int i = 0; i < size - 8 * cornerSize; i++) {
         System.out.println("|" + " ".repeat(size - 2) + "|");
      }

      // Print the bottom rounded corners
      for (int i = 0; i < cornerSize; i++) {
         System.out.print("\\");
      }
      for (int i = 0; i < size - 2 * cornerSize; i++) {
         System.out.print(" ");
      }
      for (int i = 0; i < cornerSize; i++) {
         System.out.print("/");
      }
      System.out.println();

      // Print the bottom line
      System.out.print(" ");
      for (int i = 0; i < size - 2 * cornerSize; i++) {
         System.out.print("_");
      }
      System.out.println(" ");
   }
}
