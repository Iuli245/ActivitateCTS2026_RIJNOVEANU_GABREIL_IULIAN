package cts.ase.ro.Seminar4_SimpleFactory.Main;

import cts.ase.ro.Seminar4_SimpleFactory.Clase.MijlocTransport;
import cts.ase.ro.Seminar4_SimpleFactory.Factory.Depou;
import cts.ase.ro.Seminar4_SimpleFactory.Factory.Tipuri;

public class Main {
    public static void main(String[] args) {
        Depou depou = new Depou();
        MijlocTransport autobuz = depou.getMijlocTransport(Tipuri.AUTOBUZ,4,"B444TPB");
        MijlocTransport tramvai = depou.getMijlocTransport(Tipuri.TRAMVAI,6,"B112TCB");

            autobuz.afisaredescriere();
            tramvai.afisaredescriere();
        }
}
