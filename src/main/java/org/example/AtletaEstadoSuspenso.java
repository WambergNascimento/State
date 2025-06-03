package org.example;

public class AtletaEstadoSuspenso extends AtletaEstado {

    private AtletaEstadoSuspenso() {};
    private static AtletaEstadoSuspenso instance = new AtletaEstadoSuspenso();
    public static AtletaEstadoSuspenso getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Suspenso";
    }

    public boolean aposentar(Atleta atleta) {
        atleta.setEstado(AtletaEstadoAposentado.getInstance());
        return true;
    }

    public boolean naoRenovar(Atleta atleta) {
        atleta.setEstado(AtletaEstadoNaoRenovado.getInstance());
        return true;
    }

    public boolean reintegrar(Atleta atleta) {
        atleta.setEstado(AtletaEstadoAtivo.getInstance());
        return true;
    }
}