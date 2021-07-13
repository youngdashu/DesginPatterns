package Patterns.Abstractfactory;

import Patterns.Factory.Shape;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}
