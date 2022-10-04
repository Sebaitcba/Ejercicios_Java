package Ejercicio2;

public class Funciones {

    public static void main(String[] args) {

        //Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.

        double precio = 1300D;

        System.out.println("El precio sin IVA es: $" + precio);
        System.out.println("El precio con IVA es: $" + calularIVA(precio));
    }

    public static double calularIVA(double precio) {
        //El IVA en Argentina es del 21%
        return precio * 1.21;
    }
}
