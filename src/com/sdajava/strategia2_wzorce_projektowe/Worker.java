package com.sdajava.strategia2_wzorce_projektowe;

import com.sdajava.strategia2_wzorce_projektowe.dojazd.Dojezdzac;
import com.sdajava.strategia2_wzorce_projektowe.dojazd.Rower;
import com.sdajava.strategia2_wzorce_projektowe.dojazd.Samochod;
import com.sdajava.strategia2_wzorce_projektowe.praca.Leczenie;
import com.sdajava.strategia2_wzorce_projektowe.praca.NaprawaSamochodow;
import com.sdajava.strategia2_wzorce_projektowe.praca.Pracowac;
import com.sdajava.strategia2_wzorce_projektowe.praca.RoznoszenieListow;
import com.sdajava.strategia2_wzorce_projektowe.wolny_czas.LiteraturaPopularnoNaukowa;
import com.sdajava.strategia2_wzorce_projektowe.wolny_czas.Silownia;
import com.sdajava.strategia2_wzorce_projektowe.wolny_czas.SpedzanieWolnegoCzasu;

/**
 * Created by user on 2017-04-08.
 */
public class Worker {

    private Pracowac pracowac;
    private Dojezdzac dojezdzac;
    private SpedzanieWolnegoCzasu swc;
    public String zawod;

        public Worker(String zawod) {
        if (zawod == "Mechanik") {
            this.pracowac = new NaprawaSamochodow();
            this.dojezdzac = new Samochod();
            this.swc = new Silownia();
        } else if (zawod == "Lekarz") {
            this.pracowac = new Leczenie();
            this.dojezdzac = new Samochod();
            this.swc = new LiteraturaPopularnoNaukowa();
        } else if (zawod == "Listonosz") {
            this.pracowac = new RoznoszenieListow();
            this.dojezdzac = new Rower();
            this.swc = new Silownia();
        }
    }

    public void execute() {

        pracowac.pracuj();
        dojezdzac.dojezdzaj();
        swc.spedzajwolnyczas();
    }
}
