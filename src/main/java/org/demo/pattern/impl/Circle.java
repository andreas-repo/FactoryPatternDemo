package org.demo.pattern.impl;

import org.demo.pattern.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
