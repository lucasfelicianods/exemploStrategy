package br.com.netflix.model;

import br.com.netflix.model.Interface.IContentTransformer;
import br.com.netflix.model.Interface.IPreco;
import br.com.netflix.model.Interface.PreparadorNumeroTransmissores;

public class Assinatura {

    private IPreco preco;

    private IContentTransformer transmissao;

    private PreparadorNumeroTransmissores preparadorNumeroTransmissores;

    public Assinatura(IPreco preco, IContentTransformer transmissao, PreparadorNumeroTransmissores preparadorNumeroTransmissores) {
        this.preco = preco;
        this.transmissao = transmissao;
        this.preparadorNumeroTransmissores = preparadorNumeroTransmissores;
    }

    public IPreco getPreco() {
        return preco;
    }

    public void setPreco(IPreco preco) {
        this.preco = preco;
    }

    public IContentTransformer getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(IContentTransformer transmissao) {
        this.transmissao = transmissao;
    }

    public PreparadorNumeroTransmissores getPreparadorNumeroTransmissores() {
        return preparadorNumeroTransmissores;
    }

    public void setPreparadorNumeroTransmissores(PreparadorNumeroTransmissores preparadorNumeroTransmissores) {
        this.preparadorNumeroTransmissores = preparadorNumeroTransmissores;
    }
}
