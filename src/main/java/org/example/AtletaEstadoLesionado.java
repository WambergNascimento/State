package org.example;

public class AtletaEstadoLesionado extends AtletaEstado {

    private AtletaEstadoLesionado() {};
    private static AtletaEstadoLesionado instance = new AtletaEstadoLesionado();
    public static AtletaEstadoLesionado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Lesionado";
    }

    public boolean reintegrar(Atleta atleta) {
        atleta.setEstado(AtletaEstadoAtivo.getInstance());
        return true;
    }
}