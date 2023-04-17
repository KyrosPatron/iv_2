package org.example;

public class Rectangle {
    private final int length;
    private final int width;


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getArea(){
        return this.length*this.width;
    }

    public int getPerimeter(){
        return 2 * (this.length + this.width);
    }

}
