package com.projeto.domain.strategy;

public class TaxiStrategy implements TransporteStrategy {

    @Override
    public String irParaAeroporto() {
        return "Indo de táxi 🚕";
    }
}