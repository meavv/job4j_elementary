package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;



public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 0;
        double excepted = 2.0;
        double rsl = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(excepted, rsl, 0.01);

    }
    @Test
    public void when12to34then2() {
        int x1 = 1;
        int x2 = 3;
        int y1 = 2;
        int y2 = 4;
        double excepted = 2.82;
        double rsl = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(excepted, rsl, 0.01);

    }
    @Test
    public void when79to107then3() {
        int x1 = 7;
        int x2 = 10;
        int y1 = 9;
        int y2 = 7;
        double excepted = 3.60;
        double rsl = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(excepted, rsl, 0.01);

    }
}
