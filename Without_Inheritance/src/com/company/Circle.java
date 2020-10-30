package com.company;

public class Circle {
    //Radius of the circle
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    /**
     * Returns radius of the circle
     * @return Radius of the circle
     */
    public int getRadius(){ return radius; }

    /**
     * Returns the perimeter of the circle
     * @return Perimeter of the circle
     */
    public double calculatePerimeter(){ return 2 * radius * Math.PI; }

    /**
     * Returns the area of the circle
     * @return Area of the circle
     */
    public double calculateArea(){ return Math.pow(radius,2) * Math.PI; }

    /**
     * Prints the type, perimeter and area of the circle
     */
    public void draw(){
        System.out.println("Type: Circle");
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

        Circle other = (Circle) obj;
        return this.radius == other.radius;
    }

    @Override
    public int hashCode(){
        int res = 17;
        res = 37 * res + radius;
        return res;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Circle::");
        builder.append(" radius:" + radius);
        return builder.toString();
    }

}
