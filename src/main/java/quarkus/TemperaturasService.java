package quarkus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TemperaturasService {

    private List<Temperatura> valores = new ArrayList<>();
    
    public void addTemperatura(Temperatura t) {
        valores.add(t);
    }

    public List<Temperatura> obtenerTemperaturas() {
        return Collections.unmodifiableList(valores);
    }

    public int maxima() {
        return valores.stream().mapToInt(Temperatura::getMaxima).max().getAsInt();
    }
}
