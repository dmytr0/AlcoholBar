package com.lemon.wifibar.Model;

import java.math.BigDecimal;

public class Liquid {

    BigDecimal volume;
    BigDecimal alcoholic;

    public Liquid(BigDecimal volume, BigDecimal alcoholic) {
        this.volume = volume;
        this.alcoholic = alcoholic;
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

    public void setAlcoholic(BigDecimal alcoholic) {
        this.alcoholic = alcoholic;
    }
}
