package com.projeto.domain.model;

import com.projeto.domain.strategy.TransporteStrategy;

public class Viagem {

    private TransporteStrategy estrategia;

    public void setEstrategia(TransporteStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public String iniciarViagem() {
        if (estrategia == null) {
            return "Nenhuma estratégia definida";
        }
        return estrategia.irParaAeroporto();
    }
}