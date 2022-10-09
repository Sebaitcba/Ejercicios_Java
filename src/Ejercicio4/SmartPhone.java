package Ejercicio4;

public class SmartPhone extends SmartDevice{
    Double altura;
    Double ancho;
    String conexion;

    public SmartPhone () {}

    public SmartPhone(String fabricante, String procesador, String memoria, String capacidad, Double peso, String versionSO, String sistemaOperativo, Double altura, Double ancho, String conexion) {
        super(fabricante, procesador, memoria, capacidad, peso, versionSO, sistemaOperativo);
        this.altura = altura;
        this.ancho = ancho;
        this.conexion = conexion;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "altura=" + altura +
                ", ancho=" + ancho +
                ", conexion='" + conexion + '\'' +
                ", versionSO='" + versionSO + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }
}
