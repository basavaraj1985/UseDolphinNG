package com.github.basavaraj1985;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private static Logger logger = LogManager.getLogger(AppTest.class);
    Random random = new Random();
//    private static Logger logger = LogManager.getRootLogger();

    @Test ( invocationCount = 10 )
    public void aMathRandomlyFailingTest(org.testng.ITestContext ctx)
    {
        int r1 = random.nextInt(1000), r2 = random.nextInt(1000);
//        assertTrue( r1 %2 == 0 || r2 % 2 == 0 || (r1 + r2) % 2 == 0,
//                "None of the addends, nor the sum was an even number!");
        long seed = System.currentTimeMillis() % 10;
//        assertNotEquals( r1 % seed, r2 % seed,
//                "Random " +
//                        "Addends are time correlated! [ a1: " + r1 + ", a2: " + r2 + " timeCorrelnSeed: " + seed + " ]" );
        assertTrue( r1 * r2 * seed % 3 != 0, "The product of addends and time correln id is dividable by 3!");
    }

    @Test ( invocationCount = 10 )
    public void bMathRandomlyFailingTest(org.testng.ITestContext ctx)
    {
        int r1 = random.nextInt(1000), r2 = random.nextInt(1000);
        assertTrue( r1 %2 == 1 || r2 % 2 == 1 || (r1 + r2) % 2 == 1,
                "None of the addends, nor the sum was an odd number!");
        long seed = System.currentTimeMillis() % 10;
        assertNotEquals( r1 % seed, r2 % seed,
                "Random " +
                        "Addends are time correlated! [ a1: " + r1 + ", a2: " + r2 + " timeCorrelnSeed: " + seed + " ]" );
        assertTrue( r1 * r2 * seed % 3 != 0, "The product of addends and time correln id is dividable by 3!");
    }
}
