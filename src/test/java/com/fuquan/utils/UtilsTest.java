package com.fuquan.utils;

import com.fuquan.pojo.People;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * Created by Fuquan on 6/20/2015.
 */
public class UtilsTest {
    @Test
    public void testExpectException() {
        String json = "{\"test\":4}";
        People p = Utils.JSONToPeople(json);
        assertNull(p);
    }
}
