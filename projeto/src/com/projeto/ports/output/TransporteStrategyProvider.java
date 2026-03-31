package com.projeto.ports.output;

import com.projeto.domain.strategy.TransporteStrategy;

public interface TransporteStrategyProvider {
    TransporteStrategy obter(String tipo);
}