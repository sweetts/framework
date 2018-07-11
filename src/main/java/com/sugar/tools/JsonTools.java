package com.sugar.tools;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sugar.beans.BW003Bean;

/**
 * Created by TangSu on 2017/5/26.
 */
public class JsonTools {
    public static String getStringFromObject(Object obj){
        ObjectMapper om = new ObjectMapper();
        try{
            return om.writeValueAsString(obj);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }

    public static BW003Bean getObjectFromString(String json){
        ObjectMapper om = new ObjectMapper();
        BW003Bean bw003Bean = null;
        try{
            JsonNode node = om.readTree(json);
            bw003Bean = (BW003Bean) om.readValue(node.toString(),BW003Bean.class);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return bw003Bean;
    }
}
