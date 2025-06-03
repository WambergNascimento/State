package org.example;

public class AtletaEstadoEmprestado extends AtletaEstado {

    private AtletaEstadoEmprestado() {};
    private static AtletaEstadoEmprestado instance = new AtletaEstadoEmprestado();
    public static AtletaEstadoEmprestado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Emprestado";
    }

    public boolean reintegrar(Atleta atleta) {
        atleta.setEstado(AtletaEstadoAtivo.getInstance());
        return true;
    }

    public boolean vender(Atleta atleta) {
        atleta.setEstado(AtletaEstadoVendido.getInstance());
        return true;
    }
}