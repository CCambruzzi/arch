package com.projeto.application.usecase;

public class EscolherTransporteUseCase {

    public String executar(String tipo) {

        if (tipo == null) {
            return "Transporte inválido";
        }

        switch (tipo.toLowerCase()) {

            case "onibus":
                return irDeOnibus();

            case "taxi":
                return irDeTaxi();

            case "bike":
                return irDeBicicleta();

            default:
                return "Transporte inválido";
        }
    }

    private String irDeOnibus() {
        return "Indo de ônibus 🚍";
    }

    private String irDeTaxi() {
        return "Indo de táxi 🚕";
    }

    private String irDeBicicleta() {
        return "Indo de bicicleta 🚴";
    }
}