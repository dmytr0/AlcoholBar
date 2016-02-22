package com.lemon.wifibar.Controller;


import com.lemon.wifibar.Model.Canister;
import com.lemon.wifibar.Model.Liquid;

import java.math.BigDecimal;

public class Manager {

    public void append(Canister to, Liquid from){
        BigDecimal currentVolume = to.getLiquid().getVolume();
        BigDecimal capacity = to.getCapacity();

        if(capacity.compareTo(BigDecimal.ZERO)>0 && capacity.compareTo(currentVolume)>0) {
            BigDecimal freeVolume = capacity.subtract(currentVolume);
            BigDecimal tmpVolume = freeVolume.min(from.getVolume());
            Liquid temp = new Liquid(tmpVolume, from.getAlcoholic());
            mix(to.getLiquid(), temp);
            from.setVolume(from.getVolume().subtract(tmpVolume));
        }
    }


    public void mix(Liquid first, Liquid second) {
        BigDecimal tmpVolume =  first.getVolume().add(second.getVolume());
        if(second.getVolume().compareTo(BigDecimal.ZERO)>0) {
            first.setAlcoholic(first.getVolume().multiply(first.getAlcoholic()).add(second.getVolume().multiply(second.getAlcoholic())).divide(tmpVolume));
            second.setVolume(new BigDecimal("0"));
            first.setVolume(tmpVolume);
        }
    }

    public void transfuse(Canister from, Canister to){
        append(to, from.getLiquid());
    }

    public void pourOut(Canister canister){
        canister.setLiquid(new Liquid(new BigDecimal("0"), new BigDecimal("0")));
    }

}
