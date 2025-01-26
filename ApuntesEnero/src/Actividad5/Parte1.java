package Actividad5;

import java.util.Arrays;

public class Parte1 {
/*
 * Crea un programa que implemente una función sobrecargada llamada "calcular" que realice las siguientes operaciones dependiendo del tipo de parámetro recibido:

* Media (int[]): Calcula la media de un arreglo de números enteros.
* Moda (double[]): Encuentra el valor más frecuente en un arreglo de números decimales.
* Mediana (String[]): Determina la mediana (orden alfabético) de un arreglo de cadenas.

Comentario para la actividad de Entornos de Desarrollo:
  Commit es justo lo que estoy haciendo, guardar los cambios en el repositorio local registrando su estado. 
  Un Push es mandar los cambios del repositorio local al remoto.
  un Pull es lo contrario, del remoto al local.
 */

 public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        double[] decimales = {1.1, 2.2, 3.3, 4.4, 5.5, 1.1, 1.1};
        String[] cadenas = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        System.out.println("La media de los números es: " + calcular(numeros));
        System.out.println("La moda de los decimales es: " + calcular(decimales));
        System.out.println("La mediana de las cadenas es: " + calcular(cadenas));
 }

    public static double calcular(int[] numeros){
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma / numeros.length;
    }

    public static double calcular(double[] decimales){
        double moda = 0;
        int contador = 0;
        int contadorMax = 0;
        for (int i = 0; i < decimales.length; i++) {
            contador = 0;
            for (int j = 0; j < decimales.length; j++) {
                if (decimales[i] == decimales[j]) {
                    contador++;
                }
            }
            if (contador > contadorMax) {
                contadorMax = contador;
                moda = decimales[i];
            }
        }
        return moda;
    }
 
    public static String calcular(String[] cadenas){
        Arrays.sort(cadenas);
        return cadenas[cadenas.length / 2];
    }
    
}
