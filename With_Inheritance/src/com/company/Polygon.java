package com.company;

import java.util.ArrayList;

class Polygon extends Shape {
    //List of sides of the shape
    public ArrayList<Integer> sides;

    public Polygon(int... args){
        sides = new ArrayList<Integer>();
        for( int it : args ){
            sides.add(it);
        }
    }

    /**
     * Returns list of sides of the shape
     * @return List of sides
     */
    public ArrayList<Integer> getSides(){ return sides; }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        int i=0;
        for(int it : sides){
            builder.append(" side1:"+sides.get(i));
            i++;
        }
        return builder.toString();
    }
}
