package cts.ase.ro.Seminar4_Singleton.Hotel;

public class Hotel {
    private String numeHotel;
    private int nrCamere;
    private int nrCamereOcupate;

    private static Hotel instance = null;

    private Hotel(String numeHotel, int nrCamere, int nrCamereOcupate) {
        this.numeHotel = numeHotel;
        this.nrCamere = nrCamere;
        this.nrCamereOcupate = nrCamereOcupate;
    }
    public static synchronized Hotel getInstance(String numeHotel, int nrCamere, int nrCamereOcupate){
        if(instance == null){
            instance = new Hotel(numeHotel, nrCamere, nrCamereOcupate);
        }
        return instance;
    }

    public void rezervaCamera(){
        if(this.nrCamereOcupate < this.nrCamere){
            System.out.println("Rezervarea a fost efectuata.");
            nrCamereOcupate++;
        }
        else{
            System.out.println("Nu mai sunt camere disponibile.");
        }
    }

    public void afisareDetaliiHotel(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.numeHotel).append(this.nrCamere).append(this.nrCamereOcupate);
        System.out.println(sb);

    }
}
