package task1;

import Data.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void DistFromP1ToP2() {
        Point p1 = new Point(5, 9);
        Point p2 = new Point(7, 8);
        Assert.assertEquals(p1.dist(p2), Data.CalculatedDistance);
    }

    @Test
    public void DistFromP2ToP1() {
        Point p1 = new Point(5, 9);
        Point p2 = new Point(7, 8);
        Assert.assertEquals(p2.dist(p1), Data.CalculatedDistance);
    }

    @Test
    public void DistFromP1ToP2QuallyDistFromP2ToP1() {
        Point p1 = new Point(5, 9);
        Point p2 = new Point(7, 8);
        Assert.assertEquals(p1.dist(p2), p2.dist(p1));
    }

}
