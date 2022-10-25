import java.sql.Time;
public abstract class Event {
    private String lokal;
    private String band;
    private Time dateTime;
    private int basPris = 150;
    private String info;

    public Event(){}//tom konstruktor
    
    public Event(String lokal, String band, Time dateTime, int basPris, String info){
        this.lokal = lokal;
        this.band = band;
        this.dateTime = dateTime;
        this.basPris = basPris;
        this.info = info;
    }
    public String getLokal() {
        return lokal;
    }

    public void setLokal(String lokal) {
        this.lokal = lokal;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public Time getDateTime() {
        return dateTime;
    }

    public void setDateTime(Time dateTime) {
        this.dateTime = dateTime;
    }

    public int getBasPris() {
        return basPris;
    }

    public void setBasPris(int basPris) {
        this.basPris = basPris;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
//Event
//Lokal, Band, DateTime, Baspris, Info
//Private Metod: UpdateInfo