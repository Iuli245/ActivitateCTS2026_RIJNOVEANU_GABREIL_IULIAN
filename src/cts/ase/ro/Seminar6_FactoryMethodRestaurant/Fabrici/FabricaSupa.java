package cts.ase.ro.Seminar6_FactoryMethodRestaurant.Fabrici;

import cts.ase.ro.Seminar6_FactoryMethodRestaurant.Enums.TipMancare;
import cts.ase.ro.Seminar6_FactoryMethodRestaurant.Enums.TipSupa;
import cts.ase.ro.Seminar6_FactoryMethodRestaurant.clase.FelMancare;
import cts.ase.ro.Seminar6_FactoryMethodRestaurant.clase.SupaCiuperci;
import cts.ase.ro.Seminar6_FactoryMethodRestaurant.clase.SupaLegume;

public class FabricaSupa implements FabricaAbstracta{
    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
        if(tipMancare.equals(TipSupa.LEGUME)){
            return new SupaLegume(pret, gramaj);
        }
        else if(tipMancare.equals(TipSupa.CIUPERCI)){
            return new SupaCiuperci(pret, gramaj);
        }
        return null;
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii) {
        return null;
    }
}
