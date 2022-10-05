package Ejercicio3;

public class Bucles {

    public static void main(String[] args) {
        String nombre = "";
        String[] nombres = {"Sebastián", "Ariel", "Jeremías", "Isaías"};
        for (int i = 0; i < nombres.length; i++) {
            if (i == 0) {
                nombre = nombres[i];
            } else {
                nombre = nombre + " " + nombres[i];
            }
        }
        System.out.println(nombre);
    }
}
