package cts.ase.ro.Seminar6_PrototypeRestaurant.Clase;

public class Rezervare implements RezervareAbstracta{

    private String numeClient;
    private int oraRezervare;
    private int ziuaRezervarii;
    private  String nrTelefon;

    public Rezervare(String numeClient, int oraRezervare, int ziuaRezervarii, String nrTelefon) {
        if(numeClient.length()>1){
            this.numeClient = numeClient;
        }
        else{
            this.numeClient = "Ion";
        }
        if(oraRezervare<24 || oraRezervare >9)
        {
            this.oraRezervare = oraRezervare;

        }
        else {
            this.oraRezervare = 9;
        }
        if(ziuaRezervarii<31 || ziuaRezervarii>0){
            this.ziuaRezervarii = ziuaRezervarii;

        }
        else{
            this.ziuaRezervarii = 1;
        }
        if(nrTelefon.length()==10){
            this.nrTelefon = nrTelefon;
        }else {
            this.nrTelefon = "0722101999";
        }
    }

    private Rezervare() {
    }

    @Override
    public RezervareAbstracta clone() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient=this.numeClient;
        rezervareNoua.ziuaRezervarii=this.ziuaRezervarii;
        rezervareNoua.nrTelefon=this.nrTelefon;
        rezervareNoua.oraRezervare=this.oraRezervare;

        return rezervareNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", ziuaRezervarii=").append(ziuaRezervarii);
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
