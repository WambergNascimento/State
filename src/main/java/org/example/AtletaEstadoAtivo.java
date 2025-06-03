package org.example;

public class AtletaEstadoAtivo extends AtletaEstado {

    private AtletaEstadoAtivo() {};
    private static AtletaEstadoAtivo instance = new AtletaEstadoAtivo();
    public static AtletaEstadoAtivo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Ativo";
    }

    public boolean lesionar(Atleta atleta) {
        atleta.setEstado(AtletaEstadoLesionado.getInstance());
        return true;
    }

    public boolean aposentar(Atleta atleta) {
        atleta.setEstado(AtletaEstadoAposentado.getInstance());
        return true;
    }

    public boolean suspender(Atleta atleta) {
        atleta.setEstado(AtletaEstadoSuspenso.getInstance());
        return true;
    }

    public boolean naoRenovar(Atleta atleta) {
        atleta.setEstado(AtletaEstadoNaoRenovado.getInstance());
        return true;
    }

    public boolean emprestar(Atleta atleta) {
        atleta.setEstado(AtletaEstadoEmprestado.getInstance());
        return true;
    }

    public boolean vender(Atleta atleta) {
        atleta.setEstado(AtletaEstadoVendido.getInstance());
        return true;
    }
}