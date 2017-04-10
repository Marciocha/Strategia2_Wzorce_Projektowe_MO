package com.sdajava.strategia2_wzorce_projektowe.praca;

import com.sdajava.strategia2_wzorce_projektowe.praca.Pracowac;

/**
 * Created by user on 2017-04-08.
 */
public class NaprawaSamochodow implements Pracowac {

    @Override
    public void pracuj() {
        System.out.println("Naprawiam samochody");
    }
}
