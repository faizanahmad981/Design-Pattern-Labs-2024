/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.contradodigital.composite;

/**
 *
 * @author Faizan
 */

public interface Component {
    String operation();
    void addChild(Component child);
    void removeChild(Component child);
    boolean hasChildren();
}
