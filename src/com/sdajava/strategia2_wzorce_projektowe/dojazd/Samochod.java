package com.sdajava.strategia2_wzorce_projektowe.dojazd;

import com.sdajava.strategia2_wzorce_projektowe.dojazd.Dojezdzac;

/**
 * Created by user on 2017-04-08.
 */
public class Samochod implements Dojezdzac {

    @Override
    public void dojezdzaj() {
        System.out.println("Dojezdzam samochodem");
    }
}
