package at.schuster;

import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/random")
public class RandomNumberGeneratorController {

    @GET
    //@Path("/{uptime}")
    @Produces(MediaType.TEXT_PLAIN)
    public int getRandomNumber () {
        Random rand = new Random(); //instance of random class
        int upperbound = 100;
        //generate random values from 0-24
        int int_random = rand.nextInt(upperbound);
        int_random = 500 + int_random;

        System.out.println("Random integer value from 500 to 600" + " : " + int_random);
        return int_random;
    }
}

