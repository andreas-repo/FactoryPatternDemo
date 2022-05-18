package org.demo.pattern.impl;

import org.demo.pattern.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
