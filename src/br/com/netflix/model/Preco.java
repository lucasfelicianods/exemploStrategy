package br.com.netflix.model;

import br.com.netflix.model.Interface.IPreco;

public class Preco implements IPreco {

    @Override
    public Double calculaPreco(double preco) {
        return preco;
    }

}
