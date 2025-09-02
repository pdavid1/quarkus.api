package quarkus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/temperaturas")
public class TemperaturasResource {

    private TemperaturasService temperaturas;

    @Inject
    public TemperaturasResource(TemperaturasService temperaturas) {
        this.temperaturas = temperaturas;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Temperatura nueva(Temperatura temp) {
        temperaturas.addTemperatura(temp);
        return temp;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Temperatura> list() {
        return temperaturas.obtenerTemperaturas();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/una")
    public Temperatura medición() {
        return new Temperatura("La Paz", 18, 28);
    }

    @GET
    @Path("/maxima")
    @Produces(MediaType.TEXT_PLAIN)
    public String maxima() {
        return Integer.toString(temperaturas.maxima());
    }

}
