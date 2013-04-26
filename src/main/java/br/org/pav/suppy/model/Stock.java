package br.org.pav.suppy.model;

import java.io.Serializable;
import java.util.List;

public class Stock implements Serializable {

    private String id;
    private List<SKU> skus;

    public List<br.org.pav.suppy.model.SKU> getSKUs() {
        return skus;
    }

    public void setSKUs(List<br.org.pav.suppy.model.SKU> skus) {
        this.skus = skus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
