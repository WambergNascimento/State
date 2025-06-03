package org.example;

public class Atleta {

    private String nome;
    private AtletaEstado estado;

    public Atleta() {
        this.estado = AtletaEstadoAtivo.getInstance();
    }

    public void setEstado(AtletaEstado estado) {
        this.estado = estado;
    }

    public boolean reintegrar() {
        return estado.reintegrar(this);
    }

    public boolean lesionar() {
        return estado.lesionar(this);
    }

    public boolean aposentar() {
        return estado.aposentar(this);
    }

    public boolean suspender() {
        return estado.suspender(this);
    }

    public boolean naoRenovar() {
        return estado.naoRenovar(this);
    }

    public boolean emprestar() {
        return estado.emprestar(this);
    }

    public boolean vender() {
        return estado.vender(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AtletaEstado getEstado() {
        return estado;
    }
}