package Patterns.Abstractfactory;

import Patterns.Factory.Shape;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}
