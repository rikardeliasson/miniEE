package com.cybercom;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Path("testing")
public class AnotherTest {
    @GET
    @Produces(MediaType.TEXT_HTML)
    public FileInputStream test() throws FileNotFoundException {
        File web = new File("C:\\dev\\miniEE\\template\\index.html");
        return new FileInputStream(web);
    }
}

