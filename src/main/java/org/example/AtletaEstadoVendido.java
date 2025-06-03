package org.example;

public class AtletaEstadoVendido extends AtletaEstado {

    private AtletaEstadoVendido() {};
    private static AtletaEstadoVendido instance = new AtletaEstadoVendido();
    public static AtletaEstadoVendido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Vendido";
    }
}