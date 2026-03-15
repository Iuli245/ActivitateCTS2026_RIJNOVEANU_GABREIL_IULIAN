package cts.ase.ro.Seminar4_SimpleFactory.Factory;

import cts.ase.ro.Seminar4_SimpleFactory.Clase.Autobuz;
import cts.ase.ro.Seminar4_SimpleFactory.Clase.MijlocTransport;
import cts.ase.ro.Seminar4_SimpleFactory.Clase.Tramvai;
import cts.ase.ro.Seminar4_SimpleFactory.Clase.Troleibuz;

public class Depou {
    public MijlocTransport getMijlocTransport(Tipuri tip, int numarRoti, String nrInmatriculare){
        if(tip == Tipuri.AUTOBUZ){
            return new Autobuz(numarRoti, nrInmatriculare);
        }
        if(tip == Tipuri.TRAMVAI){
            return new Tramvai(numarRoti, nrInmatriculare);
        }
        if(tip == Tipuri.TROLEIBUZ){
            return new Troleibuz(numarRoti, nrInmatriculare);
        }
        return null;
    }

}
