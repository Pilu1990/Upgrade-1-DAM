package Actividad6;

public class Metodos {
    /**
     * Método principal para probar la clase Fraccion.
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        // Pruebas básicas
        Fraccion fraccion1 = new Fraccion();
        System.out.println("Fracción: " + fraccion1);

        Fraccion fraccion2 = new Fraccion(3, 4);
        System.out.println("Fracción cambiada: " + fraccion2);

        Fraccion fraccion3 = new Fraccion(5);
        System.out.println("Fracción denominador 1: " + fraccion3);

        // Modificación de atributos
        fraccion2.setNumerador(7);
        fraccion2.setDenominador(8);
        System.out.println("Fracción modificada: " + fraccion2);

        // Denominador no cero
        try {
            fraccion2.setDenominador(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error en el denominador: " + e.getMessage());
        }
    }
}
