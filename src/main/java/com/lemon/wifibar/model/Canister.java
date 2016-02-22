package com.lemon.wifibar.Model;


import java.math.BigDecimal;

public class Canister {
    BigDecimal capacity;
    Liquid liquid;

    public Canister(BigDecimal capacity, Liquid liquid) {
        this.capacity = capacity;
        this.liquid = liquid;
    }

    @Override
    public String toString() {

        return liquid.toString();
    }

    public Liquid getLiquid() {
        return liquid;
    }

    public void setLiquid(Liquid liquid) {
        this.liquid = liquid;
    }

    public BigDecimal getCapacity() {
        return capacity;
    }


}
