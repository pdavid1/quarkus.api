package quarkus;

import java.util.Optional;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;

@Path("/saludar")
public class EcoResource {

    @GET
    public String dias(@QueryParam("mensaje") String mensaje) {
        return Optional.ofNullable(mensaje)
            .map(n -> "> " + n)
            .orElse("Noo se muy bien que decir");
    }

    @GET
    @Path("/{nombre}")
    public String saludo(@PathParam("nombre") String nombre) {
        return "Hola " + nombre;
    }

    @GET
    @Path("/{nombre}/mayusculas")
    public String gritar(@PathParam("nombre") String nombre) {
        return "HOLA " + nombre.toUpperCase();

    }
}
