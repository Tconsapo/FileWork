package test;

import com.fasterxml.jackson.databind.ObjectMapper;
 
import java.io.File;
import java.io.IOException;
 
public class Conv {
 
    //private final static String baseFile;
 
    public static void toJSON(Event event, String file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        //baseFile = file;
        mapper.writeValue(new File(file), event);
        System.out.println("json created!");
    }
 
    public static Event toJavaObject(String file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(file), Event.class);
    }
 
}