package com.projeto.domain.strategy;

public class OnibusStrategy implements TransporteStrategy {

    @Override
    public String irParaAeroporto() {
        return "Indo de ônibus 🚍";
    }
}