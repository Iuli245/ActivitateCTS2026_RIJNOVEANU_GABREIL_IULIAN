package cts.ase.ro.Seminar4_SimpleFactory.Clase;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(int numarRoti, String nrInmatriculare) {
        super(numarRoti, nrInmatriculare);
    }

    @Override
    public void afisaredescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Troleibuzul are:").append("Numar roti: ").append(super.numarRoti);
        sb.append(" Numar inmatriculare: ").append(super.nrInmatriculare);
        System.out.println(sb.toString());
    }
}
