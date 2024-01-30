import java.util.Date;

public class Electronica extends Producto {

    private int resolucionImagen;
    private int capacidadBateria;
    private  final int GARANTIA;

    public Electronica(int id, String nombre, String marca, double precio, int stock, Date fecha, double rebaja,
                       int resolucionImagen, int capacidadBateria) {
        super(id, nombre, marca, precio, stock, fecha, rebaja);
        this.resolucionImagen = resolucionImagen;
        this.capacidadBateria = capacidadBateria;
        this.GARANTIA = 9;
    }

    public int getResolucionImagen() {
        return resolucionImagen;
    }

    public void setResolucionImagen(int resolucionImagen) {
        this.resolucionImagen = resolucionImagen;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getGARANTIA() {
        return GARANTIA;
    }
}
