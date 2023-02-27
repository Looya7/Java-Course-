public class EjemploOrdenes {
    public static void main(String[] args) {

        OrdenCompra orden1= new OrdenCompra("Compra 1");
        Cliente cliente1= new Cliente("Adrian","Loya");
        Producto[] productos1= new Producto[4];
        orden1.addProcucto(new Producto("Adidas","Ax4 Hikking",299));
        orden1.addProcucto(new Producto("Puma","Predator",477.89));
        orden1.addProcucto(new Producto("Nike","Nike 8",499));
        orden1.addProcucto(new Producto("Charly","MBs7 ",279.86));
        orden1.grandTotal(cliente1);



        OrdenCompra orden2= new OrdenCompra("Compra 2");
        Cliente cliente2= new Cliente("Jesus","Loya");
        Producto[] productos2= new Producto[4];
        orden2.addProcucto(new Producto("Dell","g7 7790",14999));
        orden2.addProcucto(new Producto("Lenovo","Predator",13566));
        orden2.addProcucto(new Producto("Hp","Athlon",12899));
        orden2.addProcucto(new Producto("Dell","g5 5570 ",13499));
        orden2.grandTotal(cliente2);

        OrdenCompra orden3= new OrdenCompra("Compra 3");
        Cliente cliente3= new Cliente("Marisol","Sabido");
        Producto[] productos3= new Producto[4];
        orden3.addProcucto(new Producto("Apple","Iphone 14",23999.39));
        orden3.addProcucto(new Producto("Samsung","Samsung galaxy 10",19899.49));
        orden3.addProcucto(new Producto("Nokia","M10",9999.99));
        orden3.addProcucto(new Producto("Xiaomi","12T Pro ",7999.99));
        orden3.grandTotal(cliente3);
    }
}