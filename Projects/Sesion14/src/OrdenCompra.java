import java.util.Date;
import java.util.SplittableRandom;

public class OrdenCompra {
    private Integer id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;

    private Producto[] productos;
    private int indice;
    private int idold;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.id= ++idold;
        this.productos= new Producto[4];
    }

    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void addProcucto (Producto producto){
        this.productos[indice++]= producto;
    }
    public void grandTotal(Cliente cliente){
        double suma=0;
        String sb= this.descripcion+ "\n";
        sb+=cliente.toString();
        for(int i =0; i< productos.length;i++) {
            suma += this.productos[i].getPrecio();
            sb+="\n"+productos[i].getFabricante()+" "+productos[i].getNombre()+" "+productos[i].getPrecio();
        }
        sb+="\nEl total de la compra es = "+ suma;
        System.out.println(sb);
        System.out.println();


    }
}
