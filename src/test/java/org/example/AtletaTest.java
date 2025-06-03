package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AtletaTest {

    Atleta atleta;

    @BeforeEach
    public void setUp() {
        atleta = new Atleta();
    }

    @Test
    public void naoDeveReintegrarAtletaAtivo() {
        atleta.setEstado(AtletaEstadoAtivo.getInstance());
        assertFalse(atleta.reintegrar());
    }

    @Test
    public void deveLesionarAtletaAtivo() {
        atleta.setEstado(AtletaEstadoAtivo.getInstance());
        assertTrue(atleta.lesionar());
        assertEquals(AtletaEstadoLesionado.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveAposentarAtletaAtivo() {
        atleta.setEstado(AtletaEstadoAtivo.getInstance());
        assertTrue(atleta.aposentar());
        assertEquals(AtletaEstadoAposentado.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveSuspenderAtletaAtivo() {
        atleta.setEstado(AtletaEstadoAtivo.getInstance());
        assertTrue(atleta.suspender());
        assertEquals(AtletaEstadoSuspenso.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveNaoRenovarAtletaAtivo() {
        atleta.setEstado(AtletaEstadoAtivo.getInstance());
        assertTrue(atleta.naoRenovar());
        assertEquals(AtletaEstadoNaoRenovado.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveEmprestarAtletaAtivo() {
        atleta.setEstado(AtletaEstadoAtivo.getInstance());
        assertTrue(atleta.emprestar());
        assertEquals(AtletaEstadoEmprestado.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveVenderAtletaAtivo() {
        atleta.setEstado(AtletaEstadoAtivo.getInstance());
        assertTrue(atleta.vender());
        assertEquals(AtletaEstadoVendido.getInstance(), atleta.getEstado());
    }

    @Test
    public void deveReintegrarAtletaLesionado() {
        atleta.setEstado(AtletaEstadoLesionado.getInstance());
        assertTrue(atleta.reintegrar());
        assertEquals(AtletaEstadoAtivo.getInstance(), atleta.getEstado());
    }

    @Test
    public void naoDeveLesionarAtletaLesionado() {
        atleta.setEstado(AtletaEstadoLesionado.getInstance());
        assertFalse(atleta.lesionar());
    }

    @Test
    public void naoDeveAposentarAtletaLesionado() {
        atleta.setEstado(AtletaEstadoLesionado.getInstance());
        assertFalse(atleta.aposentar());
    }

    @Test
    public void naoDeveSuspenderAtletaLesionado() {
        atleta.setEstado(AtletaEstadoLesionado.getInstance());
        assertFalse(atleta.suspender());
    }

    @Test
    public void naoDeveNaoRenovarAtletaLesionado() {
        atleta.setEstado(AtletaEstadoLesionado.getInstance());
        assertFalse(atleta.naoRenovar());
    }

    @Test
    public void naoDeveEmprestarAtletaLesionado() {
        atleta.setEstado(AtletaEstadoLesionado.getInstance());
        assertFalse(atleta.emprestar());
    }

    @Test
    public void naoDeveVenderAtletaLesionado() {
        atleta.setEstado(AtletaEstadoLesionado.getInstance());
        assertFalse(atleta.vender());
    }

    @Test
    public void naoDeveReintegrarAtletaAposentado() {
        atleta.setEstado(AtletaEstadoAposentado.getInstance());
        assertFalse(atleta.reintegrar());
    }

    @Test
    public void naoDeveLesionarAtletaAposentado() {
        atleta.setEstado(AtletaEstadoAposentado.getInstance());
        assertFalse(atleta.lesionar());
    }

    @Test
    public void naoDeveAposentarAtletaAposentado() {
        atleta.setEstado(AtletaEstadoAposentado.getInstance());
        assertFalse(atleta.aposentar());
    }

    @Test
    public void naoDeveSuspenderAtletaAposentado() {
        atleta.setEstado(AtletaEstadoAposentado.getInstance());
        assertFalse(atleta.suspender());
    }

    @Test
    public void naoDeveNaoRenovarAtletaAposentado() {
        atleta.setEstado(AtletaEstadoAposentado.getInstance());
        assertFalse(atleta.naoRenovar());
    }

    @Test
    public void naoDeveEmprestarAtletaAposentado() {
        atleta.setEstado(AtletaEstadoAposentado.getInstance());
        assertFalse(atleta.emprestar());
    }

    @Test
    public void naoDeveVenderAtletaAposentado() {
        atleta.setEstado(AtletaEstadoAposentado.getInstance());
        assertFalse(atleta.vender());
    }

    @Test
    public void deveReintegrarAtletaSuspenso() {
        atleta.setEstado(AtletaEstadoSuspenso.getInstance());
        assertTrue(atleta.reintegrar());
        assertEquals(AtletaEstadoAtivo.getInstance(), atleta.getEstado());
    }

    @Test
    public void naoDeveLesionarAtletaSuspenso() {
        atleta.setEstado(AtletaEstadoSuspenso.getInstance());
        assertFalse(atleta.lesionar());
    }

    @Test
    public void deveAposentarAtletaSuspenso() {
        atleta.setEstado(AtletaEstadoSuspenso.getInstance());
        assertTrue(atleta.aposentar());
        assertEquals(AtletaEstadoAposentado.getInstance(), atleta.getEstado());
    }

    @Test
    public void naoDeveSuspenderAtletaSuspenso() {
        atleta.setEstado(AtletaEstadoSuspenso.getInstance());
        assertFalse(atleta.suspender());
    }

    @Test
    public void deveNaoRenovarAtletaSuspenso() {
        atleta.setEstado(AtletaEstadoSuspenso.getInstance());
        assertTrue(atleta.naoRenovar());
        assertEquals(AtletaEstadoNaoRenovado.getInstance(), atleta.getEstado());
    }

    @Test
    public void naoDeveEmprestarAtletaSuspenso() {
        atleta.setEstado(AtletaEstadoSuspenso.getInstance());
        assertFalse(atleta.emprestar());
    }

    @Test
    public void naoDeveVenderAtletaSuspenso() {
        atleta.setEstado(AtletaEstadoSuspenso.getInstance());
        assertFalse(atleta.vender());
    }

    @Test
    public void naoDeveReintegrarAtletaNaoRenovado() {
        atleta.setEstado(AtletaEstadoNaoRenovado.getInstance());
        assertFalse(atleta.reintegrar());
    }

    @Test
    public void naoDeveLesionarAtletaNaoRenovado() {
        atleta.setEstado(AtletaEstadoNaoRenovado.getInstance());
        assertFalse(atleta.lesionar());
    }

    @Test
    public void naoDeveAposentarAtletaNaoRenovado() {
        atleta.setEstado(AtletaEstadoNaoRenovado.getInstance());
        assertFalse(atleta.aposentar());
    }

    @Test
    public void naoDeveSuspenderAtletaNaoRenovado() {
        atleta.setEstado(AtletaEstadoNaoRenovado.getInstance());
        assertFalse(atleta.suspender());
    }

    @Test
    public void naoDeveNaoRenovarAtletaNaoRenovado() {
        atleta.setEstado(AtletaEstadoNaoRenovado.getInstance());
        assertFalse(atleta.naoRenovar());
    }

    @Test
    public void naoDeveEmprestarAtletaNaoRenovado() {
        atleta.setEstado(AtletaEstadoNaoRenovado.getInstance());
        assertFalse(atleta.emprestar());
    }

    @Test
    public void naoDeveVenderAtletaNaoRenovado() {
        atleta.setEstado(AtletaEstadoNaoRenovado.getInstance());
        assertFalse(atleta.vender());
    }

    @Test
    public void deveReintegrarAtletaEmprestado() {
        atleta.setEstado(AtletaEstadoEmprestado.getInstance());
        assertTrue(atleta.reintegrar());
        assertEquals(AtletaEstadoAtivo.getInstance(), atleta.getEstado());
    }

    @Test
    public void naoDeveLesionarAtletaEmprestado() {
        atleta.setEstado(AtletaEstadoEmprestado.getInstance());
        assertFalse(atleta.lesionar());
    }

    @Test
    public void naoDeveAposentarAtletaEmprestado() {
        atleta.setEstado(AtletaEstadoEmprestado.getInstance());
        assertFalse(atleta.aposentar());
    }

    @Test
    public void naoDeveSuspenderAtletaEmprestado() {
        atleta.setEstado(AtletaEstadoEmprestado.getInstance());
        assertFalse(atleta.suspender());
    }

    @Test
    public void naoDeveNaoRenovarAtletaEmprestado() {
        atleta.setEstado(AtletaEstadoEmprestado.getInstance());
        assertFalse(atleta.naoRenovar());
    }

    @Test
    public void naoDeveEmprestarAtletaEmprestado() {
        atleta.setEstado(AtletaEstadoEmprestado.getInstance());
        assertFalse(atleta.emprestar());
    }

    @Test
    public void deveVenderAtletaEmprestado() {
        atleta.setEstado(AtletaEstadoEmprestado.getInstance());
        assertTrue(atleta.vender());
        assertEquals(AtletaEstadoVendido.getInstance(), atleta.getEstado());
    }

    @Test
    public void naoDeveReintegrarAtletaVendido() {
        atleta.setEstado(AtletaEstadoVendido.getInstance());
        assertFalse(atleta.reintegrar());
    }

    @Test
    public void naoDeveLesionarAtletaVendido() {
        atleta.setEstado(AtletaEstadoVendido.getInstance());
        assertFalse(atleta.lesionar());
    }

    @Test
    public void naoDeveAposentarAtletaVendido() {
        atleta.setEstado(AtletaEstadoVendido.getInstance());
        assertFalse(atleta.aposentar());
    }

    @Test
    public void naoDeveSuspenderAtletaVendido() {
        atleta.setEstado(AtletaEstadoVendido.getInstance());
        assertFalse(atleta.suspender());
    }

    @Test
    public void naoDeveNaoRenovarAtletaVendido() {
        atleta.setEstado(AtletaEstadoVendido.getInstance());
        assertFalse(atleta.naoRenovar());
    }

    @Test
    public void naoDeveEmprestarAtletaVendido() {
        atleta.setEstado(AtletaEstadoVendido.getInstance());
        assertFalse(atleta.emprestar());
    }

    @Test
    public void naoDeveVenderAtletaVendido() {
        atleta.setEstado(AtletaEstadoVendido.getInstance());
        assertFalse(atleta.vender());
    }
}