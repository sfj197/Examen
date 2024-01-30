import java.util.Date;

public class Ropa extends Producto {

    private String talla;
    private String material;
    private String prenda;

    public Ropa(int id, String nombre, String marca, double precio, int stock, Date fecha, double rebaja,
                String talla, String material, String prenda) {
        super(id, nombre, marca, precio, stock, fecha, rebaja);
        this.talla = talla;
        this.material = material;
        this.prenda = prenda;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPrenda() {
        return prenda;
    }

    public void setPrenda(String prenda) {
        this.prenda = prenda;
    }
}
