package com.projeto.config;

import com.projeto.adapters.output.TransporteStrategyProviderImpl;
import com.projeto.application.usecase.EscolherTransporteUseCaseImpl;
import com.projeto.ports.input.EscolherTransporteUseCase;
import com.projeto.ports.output.TransporteStrategyProvider;

public class AppConfig {

    public static EscolherTransporteUseCase criarUseCase() {

        TransporteStrategyProvider provider = new TransporteStrategyProviderImpl();

        return new EscolherTransporteUseCaseImpl(provider);
    }
}