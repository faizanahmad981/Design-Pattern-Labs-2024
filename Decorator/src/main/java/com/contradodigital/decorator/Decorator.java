/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.contradodigital.decorator;

/**
 *
 * @author Faizan
 */
public class Decorator {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Shape rectangle = new Rectangle();
System.out.println("Rectangle with normal border");
rectangle.draw();

System.out.println("\nRectangle with red border");
Shape redRectangle = new RedShapeDecorator(rectangle);
redRectangle.draw();

Shape redCircle = new RedShapeDecorator(new Circle());
System.out.println("\nCircle with red border");
redCircle.draw();

    }
}
