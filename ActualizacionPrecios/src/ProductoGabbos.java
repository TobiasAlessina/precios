import java.util.ArrayList;

public  class ProductoGabbos {

    private double precioProducto;
    private String nombreProducto;

    private double ganancia;
    private ArrayList<ProductoGabbos>productos = new ArrayList<>();



    public ProductoGabbos(double precioProducto, String nombreProducto) {
        this.precioProducto=precioProducto;
        this.nombreProducto=nombreProducto;

    }

    public ArrayList<ProductoGabbos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<ProductoGabbos> productos) {
        this.productos = productos;
    }
    public void aniadirProducto(ProductoGabbos producto){
        getProductos().add(producto);
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }


    public void aplicarGanancia(double ganancia){
        this.precioProducto=getPrecioProducto()+(getPrecioProducto()*ganancia);
    }
    public void mostrarPrecios(ArrayList<ProductoGabbos> lista) {
        int i=0;
        for (ProductoGabbos producto: getProductos()){
            System.out.println(producto.getNombreProducto()+"= "+producto.getProductos()+"\n PRECIO ACTUALIZADO");
        }
    }
    public void aplicaGananciaATodos(ArrayList<ProductoGabbos> lista) {
        for (ProductoGabbos producto: getProductos()){
            producto.aplicarGanancia(0.4);
        }
    }
}
