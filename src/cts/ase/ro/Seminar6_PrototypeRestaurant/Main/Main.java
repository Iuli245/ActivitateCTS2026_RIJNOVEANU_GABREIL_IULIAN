package cts.ase.ro.Seminar6_PrototypeRestaurant.Main;

import cts.ase.ro.Seminar6_PrototypeRestaurant.Clase.Rezervare;
import cts.ase.ro.Seminar6_PrototypeRestaurant.Clase.RezervareAbstracta;

public class Main {
    public static void main(String[] args) {
        RezervareAbstracta rez1 =  new Rezervare("Alin", 22, 12, "0762210554");
        RezervareAbstracta rez2 = rez1.clone();

        rez1.toString();
        rez2.toString();
    }
}
