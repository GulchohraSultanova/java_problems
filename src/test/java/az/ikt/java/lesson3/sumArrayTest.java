package az.ikt.java.lesson3;

import org.junit.Assert;
import org.junit.Test;

public class sumArrayTest {

    @Test
    public void findSumArray() {
        Assert.assertEquals(9,sumArray.findSum(new int[]{4,5}));
        Assert.assertEquals(6,sumArray.findSum(new int[]{1,5}));
    }
}
