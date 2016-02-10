package com.lemon.wifibar;


import java.math.BigDecimal;

public class Canister {
    BigDecimal capacity;
    Liquid liquid;

    public Canister(BigDecimal capacity, Liquid liquid) {
        this.capacity = capacity;
        this.liquid = liquid;
    }

    public void append (Liquid donor){
        BigDecimal currentVolume = liquid.getVolume();
        if(capacity.compareTo(BigDecimal.ZERO)>0 && capacity.compareTo(currentVolume)>0) {
            BigDecimal freeVolume = capacity.subtract(currentVolume);
            BigDecimal tmpVolume = freeVolume.min(donor.getVolume());
            Liquid temp = new Liquid(tmpVolume, donor.getAlcoholic());
            liquid.mix(temp);
            donor.setVolume(donor.getVolume().subtract(tmpVolume));
        }

    }

    public void transfuse(Canister fromCanister){
        append(fromCanister.getLiquid());
    }

    public void pourOut(){
        liquid = new Liquid(new BigDecimal("0"), new BigDecimal("0"));
    }


    @Override
    public String toString() {

        return liquid.toString();
    }

    public Liquid getLiquid() {
        return liquid;
    }
}
