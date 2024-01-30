import java.lang.reflect.Array;
import java.util.*;

public class Producto {
    private Scanner sc = new Scanner(System.in);
    private int id;
    private static int idSiguiente = 1;
    private static String nombre;
    private static String marca;
    private static double precio;
    private int stock;
    private Date fecha;
    private double rebaja;
    private static ArrayList<Producto> stocks;

    public Producto(int id, String nombre, String marca, double precio, int stock, Date fecha, double rebaja) {
        this.id = idSiguiente;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
        this.fecha = new GregorianCalendar().getTime();
        this.rebaja = rebaja;
        stocks = new ArrayList<Producto>();
        idSiguiente++;

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getRebaja() {
        return rebaja;
    }

    public void setRebaja(double rebaja) {
        this.rebaja = rebaja;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", fecha=" + fecha +
                ", rebaja=" + rebaja +
                '}';
    }

    public static void addProduct(Producto p) {

        stocks.add(p);

        System.out.println("Producto añadido");

    }

    public void crearProducto() {

        String tipo = " ";
        Producto p;
        System.out.println("De que tipo de producto se trata (ropa,electrodomestico,electronica,belleza");
        tipo = sc.next().toLowerCase();
        System.out.println("Dime el nombre del producto");
        nombre = sc.next();
        System.out.println("Dime la marca");
        marca = sc.next();
        System.out.println("Dime el precio");
        precio = sc.nextDouble();


        switch (tipo) {

            case "ropa":
                String talla = " ";
                String material = " ";
                String prenda = " ";
                Ropa r = new Ropa(id, nombre, marca, precio, stock, fecha, rebaja, talla, material, prenda);

                stock = Producto.consultarStock(stocks, "ropa");
                System.out.println("Dime la talla");
                talla = sc.next();
                System.out.println("Dime el material");
                material = sc.next();
                System.out.println("Dime que tipo de prenda es");
                prenda = sc.next();

                Producto.addProduct(r);

                break;

            case "electrodomestico":
                double consumo = 0;
                String fechaFabricacion = "";
                int capacidadCarga = 0;
                Electrodomestico e = new Electrodomestico(id, nombre, marca, precio, stock, fecha, rebaja, consumo, fechaFabricacion, capacidadCarga);

                System.out.println("Dime su consumo");
                consumo = sc.nextDouble();
                System.out.println("La fecha de fabricacion");
                fechaFabricacion = sc.next();
                System.out.println("Dime la capacidad de carga");
                capacidadCarga = sc.nextInt();
                stock = Producto.consultarStock(stocks, "Electrodomestico");
                Producto.addProduct(e);
                break;
            case "electronica":
                int resolucionImagen = 0;
                int capacidadBateria = 0;
                Electronica s = new Electronica(id, nombre, marca, precio, stock, fecha, rebaja, resolucionImagen, capacidadBateria);

                System.out.println("Dime la resolucion de la imagen");
                resolucionImagen = sc.nextInt();

                System.out.println("Dime la capacidad de la bateria");
                capacidadBateria = sc.nextInt();
                stock = Producto.consultarStock(stocks, "electronica");
                Producto.addProduct(s);
                break;

            case "belleza":

                boolean veganos = false;
                String temporada = "";
                Belleza b = new Belleza(id, nombre, marca, precio, stock, fecha, rebaja, veganos, temporada);
                System.out.println("Es para veganos");
                veganos = sc.nextBoolean();
                System.out.println("Para que temporada es");
                temporada = sc.next();
                stock = Producto.consultarStock(stocks, "belleza");

                Producto.addProduct(b);
                break;

        }
    }

    public static int consultarStock(ArrayList<Producto> stocks, String tipo) {

        int cantidad = 0;
        if (tipo.equalsIgnoreCase("ropa")) {

            for (int i = 0; i < stocks.size(); i++) {

                if (stocks.get(i) instanceof Ropa) {

                    cantidad++;

                }

            }


        } else if (tipo.equalsIgnoreCase("electrodomestico")) {

            for (int i = 0; i < stocks.size(); i++) {

                if (stocks.get(i) instanceof Electrodomestico) {

                    cantidad++;

                }

            }


        } else if (tipo.equalsIgnoreCase("electronica")) {

            for (int i = 0; i < stocks.size(); i++) {

                if (stocks.get(i) instanceof Electronica) {

                    cantidad++;

                }

            }


        } else if (tipo.equalsIgnoreCase("belleza")) {

            for (int i = 0; i < stocks.size(); i++) {

                if (stocks.get(i) instanceof Belleza) {

                    cantidad++;

                }

            }

        }
        return cantidad;

    }

    public void eliminarProducto(String name) {

        for (int i = 0; i < stocks.size(); i++) {

            if (name.equalsIgnoreCase(stocks.get(i).getNombre())) {

                stocks.remove(i);

            }

        }

        System.out.println("Producto eliminado");
    }

    public ArrayList<Producto> ordenar(ArrayList<Producto> stocks) {

        Producto primero = stocks.get(0);

        for (int i = 1; i < stocks.size(); i++) {

            if (stocks.get(i).getPrecio() < primero.getPrecio()) {

                primero = stocks.get(i);

            }


        }
        return stocks;

    }
}