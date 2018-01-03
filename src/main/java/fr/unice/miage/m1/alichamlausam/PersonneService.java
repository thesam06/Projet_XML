package fr.unice.miage.m1.alichamlausam;


import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;


/**
* @author Chamir
*/
@Path("/personne")
public class PersonneService{

	@GET
	@Path("/alichamlausam")
	public String getClichedMessage() {
        // Return some cliched textual content
        return "Hello World";
    }

    @GET
    @Path("/total")
    @Produces("text/plain")
    public String getNbreTotal(){
    	return XQueryUtil.execXQuery("mi:countallperson()");
    }


}