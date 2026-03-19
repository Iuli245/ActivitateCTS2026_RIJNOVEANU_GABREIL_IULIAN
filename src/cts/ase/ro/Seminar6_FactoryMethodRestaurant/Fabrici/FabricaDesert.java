package cts.ase.ro.Seminar6_FactoryMethodRestaurant.Fabrici;

import cts.ase.ro.Seminar6_FactoryMethodRestaurant.Enums.TipDesert;
import cts.ase.ro.Seminar6_FactoryMethodRestaurant.Enums.TipMancare;
import cts.ase.ro.Seminar6_FactoryMethodRestaurant.clase.Clatite;
import cts.ase.ro.Seminar6_FactoryMethodRestaurant.clase.FelMancare;
import cts.ase.ro.Seminar6_FactoryMethodRestaurant.clase.Papanasi;

public class FabricaDesert implements FabricaAbstracta{

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
        return null;
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii) {

        if(tipMancare.equals(TipDesert.CLATITE)){
            return new Clatite(pret,gramaj,calorii);
        }else if(tipMancare.equals(TipDesert.PAPANASI)){
            return new Papanasi(pret,gramaj,calorii);
        }
        return null;
    }
}
