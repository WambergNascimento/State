package org.example;

public abstract class AtletaEstado {

    public abstract String getEstado();

    public boolean reintegrar(Atleta atleta) {
        return false;
    }

    public boolean lesionar(Atleta atleta) {
        return false;
    }

    public boolean aposentar(Atleta atleta) {
        return false;
    }

    public boolean suspender(Atleta atleta) {
        return false;
    }

    public boolean naoRenovar(Atleta atleta) {
        return false;
    }

    public boolean emprestar(Atleta atleta) {
        return false;
    }

    public boolean vender(Atleta atleta) {
        return false;
    }
}