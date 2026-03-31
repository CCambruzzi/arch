package com.projeto.domain.strategy;

public class BicicletaStrategy implements TransporteStrategy {

    @Override
    public String irParaAeroporto() {
        return "Indo de bicicleta 🚴";
    }
}