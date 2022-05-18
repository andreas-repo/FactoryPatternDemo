package org.demo.pattern.impl;

import org.demo.pattern.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Reactangle::draw() method.");
    }
}
