package com.app;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void add_case_1() {
        App app=new App();
        int a=5;
        int b=4;
        int expected=a + b;
        int actual=app.add(a,b);
        assertEquals(expected, actual);
    }
    @Test
    public void add_case_2() {
        App app=new App();
        int a=9;
        int b=4;
        int expected=a + b;
        int actual=app.add(a,b);
        assertEquals(expected, actual);
    }
    @Test
    public void add_case_3() {
        App app=new App();
        int a=5;
        int b=4;
        int expected=a + b;
        int actual=app.add(a,(b+1));
        assertNotEquals(expected, actual);
    }
}
