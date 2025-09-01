package quarkus;

public class Temperatura {

    private String ciudad;
    private int minima;
    private int maxima;

    public Temperatura() {

    }

    public Temperatura(String ciudad, int minima, int maxima) {
        this.ciudad = ciudad;
        this.minima = minima;
        this.maxima = maxima;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getMinima() {
        return minima;
    }

    public void setMinima(int minima) {
        this.minima = minima;
    }

    public int getMaxima() {
        return maxima;
    }

    public void setMaxima(int maxima) {
        this.maxima = maxima;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
        result = prime * result + minima;
        result = prime * result + maxima;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Temperatura other = (Temperatura) obj;
        if (ciudad == null) {
            if (other.ciudad != null)
                return false;
        } else if (!ciudad.equals(other.ciudad))
            return false;
        if (minima != other.minima)
            return false;
        if (maxima != other.maxima)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Temperatura [ciudad=" + ciudad + ", minima=" + minima + ", maxima=" + maxima + "]";
    }

}
