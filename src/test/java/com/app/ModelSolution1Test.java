package com.app;

import org.junit.Assert;
import org.junit.Test;
/**
 * The prototype model automated JUnit test for simple App.
 */
public class ModelSolution1Test {


    @Test
    public void testCase_1() {
        int a = 14;
        int b = 3;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(17, model.add(a, b));
    }

    @Test
    public void testCase_2() {
        int a = 12;
        int b = 4;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(16, model.add(a, b));
    }

    @Test
    public void testCase_3() {
        int a = 14;
        int b = 1;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(15, model.add(a, b));
    }

    @Test
    public void testCase_4() {
        int a = 3;
        int b = 1;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(4, model.add(a, b));
    }

    @Test
    public void testCase_5() {
        int a = 20;
        int b = 20;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(40, model.add(a, b));
    }

    @Test
    public void testCase_6() {
        int a = 5;
        int b = 17;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(22, model.add(a, b));
    }

    @Test
    public void testCase_7() {
        int a = 18;
        int b = 6;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(24, model.add(a, b));
    }

    @Test
    public void testCase_8() {
        int a = 13;
        int b = 15;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(28, model.add(a, b));
    }

    @Test
    public void testCase_9() {
        int a = 17;
        int b = 5;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(22, model.add(a, b));
    }

    @Test
    public void testCase_10() {
        int a = 10;
        int b = 13;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(23, model.add(a, b));
    }

    @Test
    public void testCase_11() {
        int a = 17;
        int b = 18;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(35, model.add(a, b));
    }

    @Test
    public void testCase_12() {
        int a = 15;
        int b = 6;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(21, model.add(a, b));
    }

    @Test
    public void testCase_13() {
        int a = 19;
        int b = 2;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(21, model.add(a, b));
    }

    @Test
    public void testCase_14() {
        int a = 13;
        int b = 8;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(21, model.add(a, b));
    }

    @Test
    public void testCase_15() {
        int a = 4;
        int b = 9;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(13, model.add(a, b));
    }

    @Test
    public void testCase_16() {
        int a = 13;
        int b = 6;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(19, model.add(a, b));
    }

    @Test
    public void testCase_17() {
        int a = 9;
        int b = 5;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(14, model.add(a, b));
    }

    @Test
    public void testCase_18() {
        int a = 11;
        int b = 11;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(22, model.add(a, b));
    }

    @Test
    public void testCase_19() {
        int a = 12;
        int b = 20;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(32, model.add(a, b));
    }

    @Test
    public void testCase_20() {
        int a = 5;
        int b = 15;
        ModelSolution1 model = new ModelSolution1();
        Assert.assertEquals(20, model.add(a, b));
    }

}
