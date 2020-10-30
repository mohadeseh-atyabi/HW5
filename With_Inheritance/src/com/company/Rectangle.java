package com.company;

public class Rectangle extends Polygon{

    public Rectangle(int a, int b, int c, int d){
        super(a,b,c,d);
    }

    /**
     * Checks if the shape is square or not
     * @return True if is square, False if not
     */
    public boolean isSquare(){
        if(sides.get(0) == sides.get(1)){
            return true;
        }
        return false;
    }

    @Override
    public double calculatePerimeter(){
        int res=0;
        for(int i=0; i<4; i++){
            res += sides.get(i);
        }
        return res;
    }

    @Override
    public double calculateArea(){ return sides.get(0) * sides.get(1); }

    @Override
    public void draw(){
        super.draw();
        System.out.println("Rectangle");
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
        return other.sides.contains(this.sides.get(0)) && other.sides.contains(this.sides.get(1));
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
        builder.append( super.toString() );
        return builder.toString();
    }
}
