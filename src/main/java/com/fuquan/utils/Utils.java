package com.fuquan.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fuquan.pojo.People;

/**
 * Created by Fuquan on 6/20/2015.
 */
public class Utils {

    static ObjectMapper ob = new ObjectMapper();

    public static String peopleToJSON (People people) throws Exception {

        return ob.writerWithDefaultPrettyPrinter().writeValueAsString(people);
    }

    public static People JSONToPeople(String json) throws Exception {
        return ob.readValue(json, People.class);
    }
}
