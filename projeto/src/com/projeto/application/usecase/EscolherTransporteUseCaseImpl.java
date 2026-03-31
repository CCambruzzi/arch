package com.projeto.application.usecase;

import com.projeto.domain.model.Viagem;
import com.projeto.domain.strategy.TransporteStrategy;
import com.projeto.ports.input.EscolherTransporteUseCase;
import com.projeto.ports.output.TransporteStrategyProvider;

public class EscolherTransporteUseCaseImpl implements EscolherTransporteUseCase {

    private final TransporteStrategyProvider provider;

    public EscolherTransporteUseCaseImpl(TransporteStrategyProvider provider) {
        this.provider = provider;
    }

    @Override
    public String executar(String tipo) {

        TransporteStrategy estrategia = provider.obter(tipo);

        if (estrategia == null) {
            return "Transporte inválido";
        }

        Viagem viagem = new Viagem();
        viagem.setEstrategia(estrategia);

        return viagem.iniciarViagem();
    }
}