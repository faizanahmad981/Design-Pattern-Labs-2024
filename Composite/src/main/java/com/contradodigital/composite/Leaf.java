/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.contradodigital.composite;



/**
 *
 * @author Faizan
 */

public class Leaf implements Component {
    @Override
    public String operation() {
        return "Leaf";
    }

    @Override
    public void addChild(Component child) {
        // No implementation
    }

    @Override
    public void removeChild(Component child) {
        // No implementation
    }

    @Override
    public boolean hasChildren() {
        return false;
    }
}

