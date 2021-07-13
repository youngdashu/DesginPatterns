package Patterns.Abstractfactory;

import Patterns.Factory.Shape;

public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType) ;
}
