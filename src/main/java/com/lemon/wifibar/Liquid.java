package com.lemon.wifibar;

import java.math.BigDecimal;

public class Liquid {

    BigDecimal volume = new BigDecimal("0.0");
    BigDecimal alcoholic = new BigDecimal("0.0");

    public Liquid(BigDecimal volume, BigDecimal alcoholic) {
        this.volume = volume;
        this.alcoholic = alcoholic;
    }

    public void mix(Liquid second) {
        BigDecimal tmpVolume =  volume.add(second.volume);
        if(second.volume.compareTo(BigDecimal.ZERO)>0) {
            alcoholic = volume.multiply(alcoholic).add(second.volume.multiply(second.alcoholic)).divide(tmpVolume);
            second.setVolume(new BigDecimal("0"));
            volume = tmpVolume;
        }
    }

    @Override
    public String toString() {
        String out;
        if(volume.compareTo(BigDecimal.ZERO)==0){
            out = "empty";
        }
        else{
            out =  volume.toString()+"L (" + alcoholic.toString() + "%)";
        }

        return out;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getAlcoholic() {
        return alcoholic;
    }

}
