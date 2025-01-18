package EjerciciosRecursividad;

public class Fibonacci {
/*
 * Escribe una función recursiva para obtener el ( n )-ésimo término de la serie de Fibonacci.
* Ejemplo: fibonacci(5) = 5 (secuencia: 0, 1, 1, 2, 3, 5).
 */

 public static void main(String[] args) {
        int numero = 14;
        System.out.println("El término " + numero + " de la serie de Fibonacci es: " + fibonacci(numero));
 }

    public static int fibonacci(int n){
        if (n<0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    
        }
}
