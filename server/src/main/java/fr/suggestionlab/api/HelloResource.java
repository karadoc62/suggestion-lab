package fr.suggestionlab.api;

import fr.suggestionlab.api.dto.HelloResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")  // désigne l’adresse de cette ressource à partir de la racine donc ici /api/hello
public class HelloResource{

    @GET  // cette méthode répond aux requêtes HTTP GET.
    @Produces(MediaType.APPLICATION_JSON)  // indique le format de réponse. ici Content-Type: application/json
    public HelloResponse hello() {
        return new HelloResponse("Suggestion Lab");
    }
}
