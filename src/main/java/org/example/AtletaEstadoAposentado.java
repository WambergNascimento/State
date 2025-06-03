package org.example;

public class AtletaEstadoAposentado extends AtletaEstado {

    private AtletaEstadoAposentado() {};
    private static AtletaEstadoAposentado instance = new AtletaEstadoAposentado();
    public static AtletaEstadoAposentado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aposentado";
    }
}