public class Kund {

    private String email;
    private String namn;
    private String personNr;

    public Kund(){}
    public Kund(String email, String namn, String personNr){
        this.email = email;
        this.namn = namn;
        this.personNr = personNr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getPersonNr() {
        return personNr;
    }

    public void setPersonNr(String personNr) {
        this.personNr = personNr;
    }

}
//kund
//Email, Namn, PersonNr