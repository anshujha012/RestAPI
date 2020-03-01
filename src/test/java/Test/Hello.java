/*package Test;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

    @GET
    @Produces(MediaType.TEXT_XML)
    public String helloworldxml()
    {
        String resourse="<? xml version-'1.0' ?>" + "<h1> Hello from XML file ";
        return resourse;
    }
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String helloworldhtml()
    {
        String resourse="<h1> Hello from HTML file <h1>";
        return resourse;
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String helloworldjson()
    {
        String resourse=null;
        return resourse;
    }
}*/
