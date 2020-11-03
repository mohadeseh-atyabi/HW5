package com.company;

public class Triangle extends Polygon {

    public Triangle(int a, int b, int c){
        super(a,b,c);
    }

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

    @Override
    public double calculatePerimeter(){ return sides.get(0)+sides.get(1)+sides.get(2); }

    @Override
    public double calculateArea(){
        int a=sides.get(1), b=sides.get(1), c=sides.get(2);
        int s=(a+b+c)/2;
        double  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    @Override
    public void draw(){
        super.draw();
        System.out.println("Triangle");
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
        Collections.sort(other.sides);
        Collections.sort(this.sides);
        return other.getSides().get(0)==this.getSides().get(0) && other.getSides().get(1)==this.getSides().get(1)
                && other.getSides().get(2)==this.getSides().get(2);
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
        builder.append( super.toString() );
        return builder.toString();
    }

}
