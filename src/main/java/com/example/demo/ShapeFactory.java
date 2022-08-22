package com.example.demo;

public class ShapeFactory {
    public Shape getShape(String sType) {
        if(sType==null) {
            return null;
        } else if (sType.equals("circle")) {
            return new Circle();
        } else if (sType.equals("square")) {
            return new Square();
        }
        return null;
    }

}
