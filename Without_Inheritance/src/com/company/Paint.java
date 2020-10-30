package com.company;

import java.util.ArrayList;

public class Paint {
    //List of circles
    private ArrayList<Circle> circles;
    //List of triangles
    private ArrayList<Triangle> triangles;
    //List of rectangles
    private ArrayList<Rectangle> rectangles;

    public Paint(){
        circles = new ArrayList<Circle>();
        triangles = new ArrayList<Triangle>();
        rectangles = new ArrayList<Rectangle>();
    }

    /**
     * Adds triangle to the class
     * @param triangle Triangle to add
     */
    public void addTriangle(Triangle triangle){ triangles.add(triangle); }

    /**
     * Adds rectangle to the class
     * @param rectangle Rectangle to add
     */
    public void addRectangle(Rectangle rectangle){ rectangles.add(rectangle); }

    /**
     * Adds circle to the class
     * @param circle Circle to add
     */
    public void addCircle(Circle circle){ circles.add(circle); }

    /**
     * Draws all the shapes
     */
    public void drawAll(){
        for(Circle it : circles){
            it.draw();
        }
        for(Triangle it : triangles){
            it.draw();
        }
        for(Rectangle it : rectangles){
            it.draw();
        }
    }

    /**
     * Prints all the shapes
     */
    public void printAll(){
        for(Circle it : circles){
            System.out.println(it.toString());
        }
        for(Triangle it : triangles){
            System.out.println(it.toString());
        }
        for(Rectangle it : rectangles){
            System.out.println(it.toString());
        }
    }

}
