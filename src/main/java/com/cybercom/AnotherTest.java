package com.cybercom;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Path("testing")
public class AnotherTest {

    @GET
    public FileInputStream test() throws FileNotFoundException {
        return new FileInputStream(new File("C:\\dev\\miniEE\\templates\\index.html"));
    }


}

