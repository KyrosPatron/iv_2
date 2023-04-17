package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(5,10);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getLength() {
        assertEquals(5,rectangle.getLength());
    }

    @Test
    void getWidth() {
        assertEquals(10,rectangle.getWidth());
    }

    @Test
    void getArea() {
        assertEquals(50,rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(30,rectangle.getPerimeter());
    }
}