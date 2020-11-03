package com.company;

import java.util.ArrayList;

public class Rectangle {
    //list of length of the sides
    private ArrayList<Integer> sides;

    public Rectangle(int a, int b, int c, int d){
        sides = new ArrayList<Integer>();
        sides.add(a);
        sides.add(b);
        sides.add(c);
        sides.add(d);
        Collections.sort(sides);
    }

    /**
     * Returns sides of the rectangle
     * @return Sides of the rectangle
     */
    public ArrayList<Integer> getSides(){ return sides; }

    /**
     * Returns the perimeter of the rectangle
     * @return Perimeter of the rectangle
     */
    public double calculatePerimeter(){
        int res=0;
        for(int i=0; i<4; i++){
            res += sides.get(i);
        }
        return res;
    }

    /**
     * Returns the area of the rectangle
     * @return Area of the rectangle
     */
    public double calculateArea(){ return sides.get(0) * sides.get(1); }

    /**
     * Prints the type, perimeter and area of the rectangle
     */
    public void draw(){
        System.out.println("Type: Rectangle");
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
    }

    @Override
    public boolean equals(Object obj){
        if( obj == this ){
            return true;
        }
        if( !(obj instanceof Circle) ){
            return false;
        }

        Rectangle other = (Rectangle) obj;
        return other.getSides().get(0)==this.getSides().get(0) && other.getSides().get(1)==this.getSides().get(1)
                && other.getSides().get(2)==this.getSides().get(2) && other.getSides().get(3)==this.getSides().get(3);
    }

    @Override
    public int hashCode(){
        int res = 17;
        res = 37 * res + sides.get(0);
        res = 37 * res + sides.get(1);
        return res;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Rectangle::");
        builder.append(" side1:"+sides.get(0) + ", side2:"+sides.get(2) + ", side3:"+sides.get(1) + ", side4:" +sides.get(3));
        return builder.toString();
    }

}
