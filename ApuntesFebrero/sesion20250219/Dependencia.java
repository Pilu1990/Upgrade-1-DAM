package sesion20250219;

class Pedido{
    private int numero;
    private double monto;

    public Pedido(int numero, double monto){
        this.numero=numero;
        this.monto=monto;
    }

    public void mostrarPedido(){
        System.out.println("El pedido número "+ numero+ " tiene un monto de "+ monto+ ".");
    }
}

class Cliente{

    private String nombre;

    public Cliente(String nombre){
        this.nombre=nombre;
    }

    public void hacerPedido (int numero, double monto){
        Pedido pedido = new Pedido(numero, monto);
        System.out.println("El cliente "+ nombre+ " ha hecho un pedido.");
        pedido.mostrarPedido();
    }
}

public class Dependencia {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan");
        Cliente cliente2 = new Cliente("María");
        cliente1.hacerPedido(1, 1000);
        cliente2.hacerPedido(2, 2000);
    }

}
