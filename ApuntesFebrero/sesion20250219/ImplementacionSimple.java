package sesion20250219;

interface Sonido {
    void hacerSonido();

}

interface Subir {
    void subirArbol();
}

class Gato implements Sonido, Subir {
    public void hacerSonido() {
        System.out.println("Miau");
    }
    public void subirArbol() {
        System.out.println("Sube el árbol");
    }
}

class Perro implements Sonido {
    public void hacerSonido() {
        System.out.println("Guau");
    }
}

public class ImplementacionSimple {
    public static void main(String[] args) {
        Sonido garfield = new Gato();
        Sonido patan = new Perro();
        System.out.print("Garfield hace ");
        garfield.hacerSonido();

        ((Subir) garfield).subirArbol();
        System.out.print("Patan hace ");
        patan.hacerSonido();
    }

}
