package br.com.netflix.model;

import br.com.netflix.model.Interface.IContentTransformer;

public class HD implements IContentTransformer {

    @Override
    public String converterQualidade() {
        return "HD";
    }
}
