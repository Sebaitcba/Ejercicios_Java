package Ejercicio4;

public abstract class SmartDevice {
    String fabricante;
    String procesador;
    String memoria;
    String capacidad;
    Double peso;
    String versionSO;
    String sistemaOperativo;

    public SmartDevice() {}

    public SmartDevice(String fabricante, String procesador, String memoria, String capacidad, Double peso, String versionSO, String sistemaOperativo) {
        this.fabricante = fabricante;
        this.procesador = procesador;
        this.memoria = memoria;
        this.capacidad = capacidad;
        this.peso = peso;
        this.sistemaOperativo = sistemaOperativo;
        this.versionSO = versionSO;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "fabricante='" + fabricante + '\'' +
                ", procesador='" + procesador + '\'' +
                ", memoria='" + memoria + '\'' +
                ", capacidad='" + capacidad + '\'' +
                ", peso=" + peso +
                ", versionSO='" + versionSO + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }
}


