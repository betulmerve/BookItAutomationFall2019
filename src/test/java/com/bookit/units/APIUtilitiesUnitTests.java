package com.bookit.units;

import com.bookit.utilities.APIUtilities;
import com.bookit.utilities.Environment;
import org.junit.Assert;
import org.junit.Test;
/**
 * Class with unit tests for APIUtilities class
 * Here we ensure that utilities work fine before using hem in action
 */
public class APIUtilitiesUnitTests {

    @Test
    public void getTokenTest(){

        String token= APIUtilities.getToken();
        String tokenForStudent=APIUtilities.getToken("student");
        String tokenForTeacher=APIUtilities.getToken("teacher");
        Assert.assertNotNull(token);
        Assert.assertNotNull(tokenForStudent);
        Assert.assertNotNull(tokenForTeacher);
    }

    @Test
    public void testIfUserExists(){

        int actual=APIUtilities.getUserID("blablaemail","237653");
        Assert.assertEquals(-1,actual);

        int actual2=APIUtilities.getUserID(Environment.LEADER_USERNAME,Environment.LEADER_PASSWORD);
        Assert.assertTrue(actual2>0); //if id is positive user exist indeed, otherwise it return -1
    }


}
