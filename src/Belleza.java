import java.util.Date;

public class Belleza extends Producto{

    private boolean veganos;

    private String temporada;

    public Belleza(int id, String nombre, String marca, double precio, int stock, Date fecha, double rebaja,
                   boolean veganos, String temporada) {
        super(id, nombre, marca, precio, stock, fecha, rebaja);
        this.veganos = veganos;
        this.temporada = temporada;
    }

    public boolean isVeganos() {
        return veganos;
    }

    public void setVeganos(boolean veganos) {
        this.veganos = veganos;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
}
