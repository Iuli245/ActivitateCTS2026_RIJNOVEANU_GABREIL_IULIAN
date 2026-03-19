package cts.ase.ro.Seminar6_FactoryMethodRestaurant.Fabrici;

import cts.ase.ro.Seminar6_FactoryMethodRestaurant.Enums.TipMancare;
import cts.ase.ro.Seminar6_FactoryMethodRestaurant.clase.FelMancare;

public interface FabricaAbstracta {
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj);
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii);

}
