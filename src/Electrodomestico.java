import java.util.Date;

public class Electrodomestico extends Producto {

    private double consumo;
    private String fechaFabricacion;
    private int capacidadCarga;
    private final int GARANTIA;

    public Electrodomestico(int id, String nombre, String marca, double precio, int stock, Date fecha, double rebaja,
                            double consumo, String fechaFabricacion, int capacidadCarga) {
        super(id, nombre, marca, precio, stock, fecha, rebaja);
        this.consumo = consumo;
        this.fechaFabricacion = fechaFabricacion;
        this.capacidadCarga = capacidadCarga;
        this.GARANTIA = 18;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getGARANTIA() {
        return GARANTIA;
    }
}
