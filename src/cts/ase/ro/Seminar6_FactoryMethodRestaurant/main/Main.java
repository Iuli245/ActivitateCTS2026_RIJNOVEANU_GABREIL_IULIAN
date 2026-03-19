package cts.ase.ro.Seminar6_FactoryMethodRestaurant.main;

import cts.ase.ro.Seminar6_FactoryMethodRestaurant.Enums.TipDesert;
import cts.ase.ro.Seminar6_FactoryMethodRestaurant.Enums.TipMancare;
import cts.ase.ro.Seminar6_FactoryMethodRestaurant.Enums.TipSupa;
import cts.ase.ro.Seminar6_FactoryMethodRestaurant.Fabrici.FabricaDesert;
import cts.ase.ro.Seminar6_FactoryMethodRestaurant.Fabrici.FabricaSupa;
import cts.ase.ro.Seminar6_FactoryMethodRestaurant.clase.FelMancare;

public class Main {
    public static void main(String[] args) {
        FabricaDesert fabricaDesert = new FabricaDesert();
        FabricaSupa fabricaSupa =  new FabricaSupa();

        FelMancare supaCiuperci = fabricaSupa.getFelMancare(TipSupa.CIUPERCI,15.5f,200);
        FelMancare supaLegume = fabricaSupa.getFelMancare(TipSupa.LEGUME, 12.5f,170);

       FelMancare clatite = fabricaDesert.getFelMancare(TipDesert.CLATITE, 20f,200f,12);
       FelMancare papanasi = fabricaDesert.getFelMancare(TipDesert.PAPANASI, 26f,200f, 25 );

        supaCiuperci.afisare();
       // supaLegume.afisare();
       // clatite.afisare();
       // papanasi.afisare();
    }
}
