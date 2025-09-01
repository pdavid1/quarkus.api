package quarkus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/temperaturas")
public class TemperaturasResource {

    private List<Temperatura> valores = new ArrayList<>();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Temperatura nueva(Temperatura temp) {
        valores.add(temp);
        return temp;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Temperatura> list() {
        return Collections.unmodifiableList(valores);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/una")
    public Temperatura medición() {
        return new Temperatura("La Paz", 18, 28);
    }

}
