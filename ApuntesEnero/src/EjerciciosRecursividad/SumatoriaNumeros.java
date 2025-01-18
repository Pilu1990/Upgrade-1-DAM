package EjerciciosRecursividad;

public class SumatoriaNumeros {
/*
 * Escribe una función recursiva que calcule la suma de los números del 1 al ( n ).
* Ejemplo: suma(5) = 1 + 2 + 3 + 4 + 5 = 15.
 */

public static void main(String[] args) {
    int numero = 10;
    System.out.println("La suma de los números del 1 al " + numero + " es: " + suma(numero));
}

public static int suma(int n){
    if (n<0) {
        return -1;
    } else if (n == 0) {
        return 0;
    } else {
        return n + suma(n - 1);
    }

    }
}
