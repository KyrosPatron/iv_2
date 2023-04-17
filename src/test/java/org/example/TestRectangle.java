package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class TestRectangle {

    @Test
    void testRectangleLength(){
        Rectangle rectangle = new Rectangle(5,10);
        assertEquals(5,rectangle.getLength());
    }
    @Test
    void testRectangleWidth(){
        Rectangle rectangle = new Rectangle(5,10);
        assertEquals(10,rectangle.getWidth());
    }
    @Test
    void testRectangleArea(){
        Rectangle rectangle = new Rectangle(5,10);
        assertEquals(50,rectangle.getArea());
    }
    @Test
    void testRectanglePerimeter(){
        Rectangle rectangle = new Rectangle(5,10);
        assertEquals(30,rectangle.getPerimeter());
    }
}
