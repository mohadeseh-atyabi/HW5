package com.company;

public class Circle extends Shape {
    //Radius of the circle
    private int radius;

    public Circle(int radius){
        super();
        this.radius = radius;
    }

    /**
     * Returns radius of the circle
     * @return Radius
     */
    public int getRadius(){ return radius; }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public boolean equals(Object obj) {
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
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Circle::");
        builder.append(" radius:" + radius);
        return builder.toString();
    }

    @Override
    public void draw(){
        System.out.println("Type: Circle");
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
    }
}
