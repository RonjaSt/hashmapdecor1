import java.util.Random;
public class Biljett {
   
    /*    EventImplementation add;

    public Biljett(EventImplementation add){this.add = add;}
    public double pris(){
        return add.pris() + 100;
    }*/
    /*EventInterface event;
*/
    private int biljettId;
    private boolean betalStat;
    private String biljettTyp;
    private String personNr;

    
    public Biljett(){}
   /* public Biljett (EventInterface event){this.event = event;}*/

    public Biljett(int biljettId, boolean betalStat, String biljettTyp){
        this.biljettId = biljettId;
        this.betalStat = betalStat;
        this.biljettTyp = biljettTyp;
        this.personNr = personNr;
    }





    public int getBiljettId() {
        return biljettId;
    }
    public void setBiljettId(int biljettId) {
        this.biljettId = biljettId;
    }



    public boolean isBetalStat() {
        return betalStat;
    }

    public void setBetalStat(boolean betalStat) {
        this.betalStat = betalStat;
    }

    public String getBiljettTyp() {
        return biljettTyp;
    }

    public void setBiljettTyp(String biljettTyp) {
        this.biljettTyp = biljettTyp;
    }




}


//Biljett
//Hashmap/Array: BiljettId, Betalstatus, BiljettTyp
//Metod: BokaBilj

