package br.com.netflix.model;

import br.com.netflix.model.Interface.PreparadorNumeroTransmissores;

public class TransmissaoQuadrupla implements PreparadorNumeroTransmissores {

    @Override
    public Integer prepararAmbienteParaTransmissoresSimultaneos() {
        return 4;
    }

}
