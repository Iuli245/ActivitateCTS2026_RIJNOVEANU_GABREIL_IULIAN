package cts.ase.ro.Seminar4_Singleton.main;

import cts.ase.ro.Seminar4_Singleton.Hotel.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel1 = Hotel.getInstance("Minerva",56,23);
        Hotel hotel2 =  Hotel.getInstance("MegaNebuniaHotel", 200,0);

        hotel1.rezervaCamera();
        hotel1.rezervaCamera();

        hotel2.rezervaCamera();
        hotel2.rezervaCamera();

        hotel1.afisareDetaliiHotel();
        hotel2.afisareDetaliiHotel();
    }
}
