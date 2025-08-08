package model;

import entities.enums.Color;

public class Rectangle extends Shape {

    private Double width;
    private Double height;

    public Rectangle(Color color, double height,double width) {
        super(color);
        this.width = width;
        this.height = height;
    }
    public  Rectangle(){
        super();
    }

    public Double getHeight() {

        return height;
    }

    public void setHeight(Double height) {

        this.height = height;
    }

    public Double getWidth() {

        return width;
    }

    public void setWidth(Double width) {

        this.width = width;
    }
    @Override
    public double area(){

        return width*height;
    }


}
