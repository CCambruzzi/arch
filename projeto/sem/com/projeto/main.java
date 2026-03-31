package com.projeto;

import com.projeto.adapters.input.ConsoleAdapter;
import com.projeto.application.usecase.EscolherTransporteUseCase;

public class Main {

    public static void main(String[] args) {

        EscolherTransporteUseCase useCase = new EscolherTransporteUseCase();
        ConsoleAdapter console = new ConsoleAdapter(useCase);

        console.executar("taxi");
        console.executar("onibus");
        console.executar("bike");
        console.executar("aviao");
    }
}