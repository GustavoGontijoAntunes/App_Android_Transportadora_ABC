package com.example.app02_transportadoraabc;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Test
    // Teste verdadeiro 1
    public void testeCaseA() {
        assertEquals(22.0, MainActivity.calcular(10.0,10.0), 0.01);
    }

    @Test
    // Teste verdadeiro 2
    public void testeCaseB() {
        assertEquals(456.50, MainActivity.calcular(371.20,5.59), 0.01);
    }

    @Test
    //Teste falso 1
    public void testeCaseC(){
        assertNotEquals(30.0, MainActivity.calcular(10.0,10.0));
    }

    @Test
    //Teste falso 2
    public void testeCaseD(){
        assertNotEquals(500.0, MainActivity.calcular(371.20,5.59));
    }
}