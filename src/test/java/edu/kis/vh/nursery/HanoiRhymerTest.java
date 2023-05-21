package edu.kis.vh.nursery;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;


public class HanoiRhymerTest extends TestCase {
    private static final int[] TESTING_VALUES = {7,6,8,9,10,3,2,2,5,2,1,0};
    @Test
    public void testCountIn() {
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(TESTING_VALUES[0]);

        int result = rhymer.peekaboo();
        Assert.assertEquals(TESTING_VALUES[0], result);
    }
    @Test
    public void testReportRejected() {
        final int[] EXPECTED_TESTING_VALUES = {0,1,2,2,2,3,6,7};

        HanoiRhymer rhymer=new HanoiRhymer();

        int result=rhymer.reportRejected();
        Assert.assertEquals(0, result);

        for(int testValue: TESTING_VALUES)
        {
            rhymer.countIn(testValue);
        }
        for(int testValue: EXPECTED_TESTING_VALUES)
        {
            result=rhymer.countOut();
            Assert.assertEquals(testValue, result);
        }

        result=rhymer.reportRejected();
        Assert.assertEquals(4, result);
    }
    @Test
    public void testCallCheck() {
        HanoiRhymer rhymer = new HanoiRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertEquals(true, result);

        rhymer.countIn(TESTING_VALUES[0]);

        result = rhymer.callCheck();
        Assert.assertEquals(false, result);

        int resultInt=rhymer.countOut();
        Assert.assertEquals(resultInt, TESTING_VALUES[0]);

        result = rhymer.callCheck();
        Assert.assertEquals(true, result);
    }
}