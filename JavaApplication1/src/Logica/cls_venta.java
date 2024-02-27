package Logica;

public class cls_venta {
    
    private int id_usuarioInt;
    private String categoria_productoStr;
    private String nombre_productoStr;
    private double precio_productoDou;
    private int cantidadInt;
    private double totalDou;
    


    public cls_venta(int id_usuarioInt, String categoria_productoStr, String nombre_productoStr, double precio_productoDou,
            int cantidadInt, double totalDou) {
        this.id_usuarioInt = id_usuarioInt;
        this.categoria_productoStr = categoria_productoStr;
        this.nombre_productoStr = nombre_productoStr;
        this.precio_productoDou = precio_productoDou;
        this.cantidadInt = cantidadInt;
        this.totalDou = totalDou;
    }

    public int getId_usuarioInt() {
        return id_usuarioInt;
    }

    public String getCategoria_productoStr() {
        return categoria_productoStr;
    }

    public String getNombre_productoStr() {
        return nombre_productoStr;
    }

    public double getPrecio_productoDou() {
        return precio_productoDou;
    }

    public int getCantidadInt() {
        return cantidadInt;
    }

    public double getTotalDou() {
        return totalDou;
    }



}
