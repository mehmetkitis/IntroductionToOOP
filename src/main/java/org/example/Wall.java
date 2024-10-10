package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double width , double height){
        this.width = width;
        this.height =height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double setWidth(double wid){
        width = wid;
        if (wid<0){
            width = 0;
        }
        return width;
    }

    public double setHeight(double hei){
        height = hei;
        if (hei<0){
            height = 0;
        }
        return height;
    }

    public double getArea(){
        return height*width;
    }
}
