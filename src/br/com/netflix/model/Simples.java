package br.com.netflix.model;

import br.com.netflix.model.Interface.IContentTransformer;

public class Simples implements IContentTransformer {

    @Override
    public String converterQualidade() {
        return "Simples";
    }

}
