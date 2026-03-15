package cts.ase.ro.Seminar4_SimpleFactory.Clase;

public class Tramvai extends MijlocTransport{

    public Tramvai(int numarRoti, String nrInmatriculare) {
        super(numarRoti, nrInmatriculare);
    }

    @Override
    public void afisaredescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tramvaiul are: ").append("Numar roti: ").append(super.numarRoti);
        sb.append(" Numar inmatriculare: ").append(super.nrInmatriculare);
        System.out.println(sb.toString());
    }
}
