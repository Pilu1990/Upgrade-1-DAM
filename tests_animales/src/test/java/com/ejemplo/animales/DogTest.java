package com.ejemplo.animales;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DogTest {

    @Test
    public void testMakeSound(){
        Dog dog = new Dog("Zero");
        assertEquals("Woof!", dog.makeSound());
    }

    @Test
    public void testGetName(){
        Dog dog = new Dog("Zero");
        assertEquals("Zero", dog.getName());
    }

}
