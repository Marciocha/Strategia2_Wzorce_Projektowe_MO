package com.sdajava.strategia2_wzorce_projektowe;

public class Main {

    public static void main(String[] args) {

        Worker worker1 = new Worker("Mechanik");
        worker1.execute();

        Worker worker2 = new Worker("Lekarz");
        worker2.execute();

        Worker worker3 = new Worker("Listonosz");
        worker3.execute();
    }
}