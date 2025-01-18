package EjerciciosFunciones;

public class EjercicioFunciones03 {

    public static void main(String[] args) {
        System.out.println(mayor(3,8,1));
    
    }

    public static int mayor(int numero1, int numero2, int numero3){

    int numeroMayor;
    if (numero1 >= numero2 && numero1 >= numero3) {
        numeroMayor = numero1;
    } else if (numero2 >= numero1 && numero2 >= numero3) {
        numeroMayor = numero2;
    } else {
        numeroMayor = numero3;
    }
    return numeroMayor;
}
}
