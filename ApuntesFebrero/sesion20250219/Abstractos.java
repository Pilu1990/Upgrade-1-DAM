package sesion20250219;

abstract class Empleado{
    // Quiero que todos los empleados tengan un nombre, un salario y un método que resuma esta información
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario){
        this.nombre=nombre;
        this.salario=salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public abstract void resumen();

}

class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, double salario, String departamento){
        super(nombre,salario);
        this.departamento=departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void resumen(){
        System.out.println("El gerente "+ nombre+ " del departamento "+ departamento +" tiene un salario de "+ salario+"€.");
    }
}

class Programador extends Empleado{
    private String lenguaje;
    public Programador(String nombre, double salario, String lenguaje){
        super(nombre, salario);
        this.lenguaje=lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void resumen(){
        System.out.println("El programador "+ nombre+ " de lenguaje "+ lenguaje +" tiene un salario de "+ salario+"€.");
    }
}

public class Abstractos {
public static void main(String[] args) {
    Gerente ana = new Gerente("Ana", 5000, "IT");
    Programador juan = new Programador("Juan", 2500, "Java");   
    ana.resumen();
    juan.resumen();
}
}
