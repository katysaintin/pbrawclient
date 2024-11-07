package sampledata;

import java.net.URL;

public class SampleDataResource {
    
    public static String getResource(String fileName) {
        URL resource = SampleDataResource.class.getResource(fileName);
        return resource != null ? resource.getFile() : "src/test/resources/sampledata/" + fileName;
    }
    
   

}
