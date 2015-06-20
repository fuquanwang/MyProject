package com.fuquan.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fuquan.pojo.People;

/**
 * Created by Fuquan on 6/20/2015.
 */
public class Utils {
    public static String peopleToJSON (People people) throws Exception {
        ObjectMapper ob = new ObjectMapper();

        return ob.writerWithDefaultPrettyPrinter().writeValueAsString(people);
    }
}
