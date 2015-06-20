package com.fuquan.utils;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fuquan.pojo.People;
import com.google.common.base.Throwables;

/**
 * Created by Fuquan on 6/20/2015.
 */
public class Utils {

    static ObjectMapper ob = new ObjectMapper();

    public static String peopleToJSON (People people) throws Exception {
        return ob.writerWithDefaultPrettyPrinter().writeValueAsString(people);
    }

    public static People JSONToPeople(String json) {
        try {
            return ob.readValue(json, People.class);
        } catch(Exception ex) {
            Throwables.getStackTraceAsString(ex);
        }
        return null;
    }
}
