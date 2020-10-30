package com.company;

import java.util.ArrayList;

public class Paint {
    //List of shapes
    private ArrayList<Shape> shapes;

    public Paint(){
        shapes = new ArrayList<Shape>();
    }

    /**
     * Adds a shape to the list
     */
    public void addShape(Shape shape){ shapes.add(shape); }

    /**
     * Draws all the shapes
     */
    public void drawAll(){
        for(Shape it : shapes){
            it.draw();
        }
    }

    /**
     * Prints all the shapes
     */
    public void printAll(){
        for(Shape it : shapes){
            System.out.println(it.toString());
        }
    }

    /**
     * Checks whether the shape is square/equilateral or not
     */
    public void describeEqualSides(){
        for(Shape it : shapes){
            if(it instanceof Triangle){
                if(((Triangle) it).isEquilateral()){
                    System.out.println(it.toString()+" is equilateral");
                }
            }
            else if(it instanceof Rectangle){
                if(((Rectangle) it).isSquare()){
                    System.out.println(it.toString()+" is square");
                }
            }
        }
    }
}
