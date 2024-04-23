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
public class RoundedRectangle implements Shape {
   @Override
   public void draw() {
      System.out.println("Inside RoundedRectangle::draw() method.");
      int width = 55; // Width of the rectangle
      int height = 8; // Height of the rectangle
      int cornerSize = 2; // Size of the rounded corners

      // Print the top line
      System.out.print(" ");
      for (int i = 0; i < width - 2 * cornerSize; i++) {
         System.out.print("_");
      }
      System.out.println(" ");

      // Print the top rounded corners
      for (int i = 0; i < cornerSize; i++) {
         System.out.print("/");
      }
      for (int i = 0; i < width - 2 * cornerSize; i++) {
         System.out.print(" ");
      }
      for (int i = 0; i < cornerSize; i++) {
         System.out.print("\\");
      }
      System.out.println();

      // Print the sides
      for (int i = 0; i < height - 2; i++) {
         System.out.println("|" + " ".repeat(width - 2) + "|");
      }

      // Print the bottom rounded corners
      for (int i = 0; i < cornerSize; i++) {
         System.out.print("\\");
      }
      for (int i = 0; i < width - 2 * cornerSize; i++) {
         System.out.print(" ");
      }
      for (int i = 0; i < cornerSize; i++) {
         System.out.print("/");
      }
      System.out.println();

      // Print the bottom line
      System.out.print(" ");
      for (int i = 0; i < width - 2 * cornerSize; i++) {
         System.out.print("_");
      }
      System.out.println(" ");
   }
}
