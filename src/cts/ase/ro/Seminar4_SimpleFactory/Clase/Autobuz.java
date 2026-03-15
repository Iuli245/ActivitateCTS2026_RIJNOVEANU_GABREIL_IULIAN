package cts.ase.ro.Seminar4_SimpleFactory.Clase;

public class Autobuz extends  MijlocTransport{
    public Autobuz(int numarRoti, String nrInmatriculare) {
        super(numarRoti, nrInmatriculare);
    }

    @Override
    public void afisaredescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autobuzul are: ").append("Numar roti: ").append(super.numarRoti);
        sb.append(" Numar inmatriculare: ").append(super.nrInmatriculare);
        System.out.println(sb.toString());
    }
}
