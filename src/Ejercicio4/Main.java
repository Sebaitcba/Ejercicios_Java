package Ejercicio4;

public class Main {

    public static void main(String[] args) {

        SmartPhone iphone = new SmartPhone("Apple","Qualcomm Snapdragon 8+ Gen 1","32 Gb","128 Gb", 568.76,"16","IOS 16",14.32,6.34,"3G, 4G, 5G");
        SmartWatch appleWatch = new SmartWatch("Apple","Snapdragon Wear 4100","4 Gb", "32 Gb",200.23,"15","watchOS 8","Rectangular",true);

        System.out.println("Fabricante: " + iphone.fabricante + " , Capacidad: " + iphone.capacidad);
        System.out.println("Fabricante: " + appleWatch.fabricante + ", Tipo de pantalla: " + appleWatch.tipoPantalla);
    }
}
