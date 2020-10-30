package com.company;

import java.util.ArrayList;

public class Triangle {
    //List to hold length of sides
    private ArrayList<Integer> sides;

    public Triangle(int a, int b, int c){
        sides = new ArrayList<Integer>();
        sides.add(a);
        sides.add(b);
        sides.add(c);
    }

    /**
     * returns the sides of the triangle
     * @return List of sides
     */
    public ArrayList<Integer> getSides(){ return sides; }

    /**
     * If three sides are equal returns true, else returns false
     * @return True if equal, False if not
     */
    public boolean isEquilateral(){
        if( sides.get(0) == sides.get(1) ){
            if( sides.get(0) == sides.get(2) ){
                return true;
            }
        }

        return false;
    }

    /**
     * Returns the perimeter of the triangle
     * @return Perimeter of the triangle
     */
    public double calculatePerimeter(){ return sides.get(0)+sides.get(1)+sides.get(2); }

    /**
     * Returns the area of the triangle
     * @return Area of the triangle
     */
    public double calculateArea(){
        int a=sides.get(1), b=sides.get(1), c=sides.get(2);
        int s=(a+b+c)/2;
        double  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    /**
     * Prints the type, perimeter and area of the triangle
     */
    public void draw(){
        System.out.println("Type: Triangle");
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
    }

    @Override
    public boolean equals(Object obj){
        if( obj == this ){
            return true;
        }
        if( !(obj instanceof Triangle) ){
            return false;
        }

        Triangle other = (Triangle) obj;
        return other.sides.contains(this.sides.get(0)) &&
                other.sides.contains(this.sides.get(1)) && other.sides.contains(this.sides.get(2));
    }

    @Override
    public int hashCode(){
        int res = 17;
        res = 37 * res + sides.get(0);
        res = 37 * res + sides.get(1);
        res = 37 * res + sides.get(2);
        return res;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Triangle::");
        builder.append(" side1:"+sides.get(0) + ", side2:"+sides.get(1) + ", side3:"+sides.get(2));
        return builder.toString();
    }

}
