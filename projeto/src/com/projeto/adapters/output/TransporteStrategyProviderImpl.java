package com.projeto.adapters.output;

import com.projeto.domain.strategy.*;
import com.projeto.ports.output.TransporteStrategyProvider;

import java.util.HashMap;
import java.util.Map;

public class TransporteStrategyProviderImpl implements TransporteStrategyProvider {

    private final Map<String, TransporteStrategy> estrategias = new HashMap<>();

    public TransporteStrategyProviderImpl() {
        estrategias.put("onibus", new OnibusStrategy());
        estrategias.put("taxi", new TaxiStrategy());
        estrategias.put("bike", new BicicletaStrategy());
    }

    @Override
    public TransporteStrategy obter(String tipo) {
        if (tipo == null) return null;
        return estrategias.get(tipo.toLowerCase());
    }
}