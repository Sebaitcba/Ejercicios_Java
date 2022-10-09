package Ejercicio4;

public class SmartWatch extends SmartDevice{
    String tipoPantalla;
    boolean midePulsaciones;

    public SmartWatch(){}

    public SmartWatch(String fabricante, String procesador, String memoria, String capacidad, Double peso, String versionSO, String sistemaOperativo, String tipoPantalla, boolean midePulsaciones) {
        super(fabricante, procesador, memoria, capacidad, peso, versionSO, sistemaOperativo);
        this.tipoPantalla = tipoPantalla;
        this.midePulsaciones = midePulsaciones;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "tipoPantalla='" + tipoPantalla + '\'' +
                ", midePulsaciones=" + midePulsaciones +
                '}';
    }
}
