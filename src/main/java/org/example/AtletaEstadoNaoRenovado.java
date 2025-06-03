package org.example;

public class AtletaEstadoNaoRenovado extends AtletaEstado {

    private AtletaEstadoNaoRenovado() {};
    private static AtletaEstadoNaoRenovado instance = new AtletaEstadoNaoRenovado();
    public static AtletaEstadoNaoRenovado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "NaoRenovado";
    }
}