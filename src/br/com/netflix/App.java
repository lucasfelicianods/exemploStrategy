package br.com.netflix;

import br.com.netflix.model.*;
import br.com.netflix.model.Interface.IContentTransformer;
import br.com.netflix.model.Interface.IPreco;
import br.com.netflix.model.Interface.PreparadorNumeroTransmissores;

public class App {

    public static void main(String[] args) {

        IPreco preco = new Preco();
        IContentTransformer transmissao = new Simples();
        PreparadorNumeroTransmissores numeroTransmissores = new TransmissaoUnica();
        Assinatura assinatura = new Assinatura(preco, transmissao, numeroTransmissores);

        imprimirAssinatura(assinatura);

        transmissao = new HD();
        numeroTransmissores = new TransmissaoDupla();
        assinatura = new Assinatura(preco, transmissao, numeroTransmissores);

        imprimirAssinatura(assinatura);

        transmissao = new UltraHD();
        numeroTransmissores = new TransmissaoQuadrupla();
        assinatura = new Assinatura(preco, transmissao, numeroTransmissores);

        imprimirAssinatura(assinatura);
    }

    public static void imprimirAssinatura(Assinatura assinatura) {
        System.out.println("Preço: " + assinatura.getPreco() + ", Transmissão: " + assinatura.getTransmissao() + ", Numero de Transmissores: " + assinatura.getPreparadorNumeroTransmissores());
    }

}
