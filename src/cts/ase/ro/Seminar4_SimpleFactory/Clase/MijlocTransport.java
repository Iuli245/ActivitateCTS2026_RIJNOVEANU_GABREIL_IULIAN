package cts.ase.ro.Seminar4_SimpleFactory.Clase;

public abstract class MijlocTransport {
    protected int numarRoti;
    protected String nrInmatriculare;

    public MijlocTransport(int numarRoti, String nrInmatriculare) {
        this.numarRoti = numarRoti;
        this.nrInmatriculare = nrInmatriculare;
    }

    public abstract void afisaredescriere();
}
