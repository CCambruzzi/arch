package com.projeto.adapters.input;

import com.seuprojeto.application.usecase.EscolherTransporteUseCase;

public class ConsoleAdapter {

    private final EscolherTransporteUseCase useCase;

    public ConsoleAdapter(EscolherTransporteUseCase useCase) {
        this.useCase = useCase;
    }

    public void executar(String tipo) {
        String resultado = useCase.executar(tipo);
        System.out.println(resultado);
    }
}