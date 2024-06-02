/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.contradodigital.composite;

/**
 *
 * @author Faizan
 */


import java.util.ArrayList;

public class Container implements Component {
    private ArrayList<Component> children = new ArrayList<>();

    @Override
    public String operation() {
        int i = 0;
        String result = "Branch(";
        for (Component child : children) {
            result += child.operation();
            if (i != children.size() - 1) {
                result += "+";
            }
            i++;
        }
        return result + ")";
    }

    @Override
    public void addChild(Component child) {
        children.add(child);
    }

    @Override
    public void removeChild(Component child) {
        children.remove(child);
    }

    @Override
    public boolean hasChildren() {
        return !children.isEmpty();
    }
}
