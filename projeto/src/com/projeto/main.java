package com.projeto;

import com.projeto.adapters.input.ConsoleAdapter;
import com.projeto.config.AppConfig;
import com.projeto.ports.input.EscolherTransporteUseCase;

public class Main {

    public static void main(String[] args) {

        EscolherTransporteUseCase useCase = AppConfig.criarUseCase();

        ConsoleAdapter console = new ConsoleAdapter(useCase);

        console.executar("taxi");
        console.executar("onibus");
        console.executar("bike");
        console.executar("aviao"); // teste inválido
    }
}