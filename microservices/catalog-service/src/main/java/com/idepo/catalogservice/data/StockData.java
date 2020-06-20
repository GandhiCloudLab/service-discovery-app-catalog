
package com.idepo.catalogservice.data;

public class StockData {

    private int id;
    private String catalogshortid;
    private int qty;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatalogshortid() {
        return catalogshortid;
    }

    public void setCatalogshortid(String catalogshortid) {
        this.catalogshortid = catalogshortid;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}