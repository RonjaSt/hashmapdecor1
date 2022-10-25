
public class Sittplats {
       private int stolNr;
        public int booked;
        public int reserved;
        public int radNr;
        public String platsTyp;

        public Sittplats(int stolNr, int booked, int reserved, int radNr,  String platsTyp){
            this.stolNr = stolNr;
            this.booked= booked;
            this.reserved = reserved;
            this.radNr = radNr;
            this.platsTyp = platsTyp;

        }

        public int getStolNr() {
            return stolNr;
        }

        public void setStolNr(int stolNr) {
            this.stolNr = stolNr;
        }

        public int getBooked() {
            return booked;
        }

        public void setBooked(int booked) {
            this.booked = booked;
        }

        public int getReserved() {
            return reserved;
        }

        public void setReserved(int reserved) {
            this.reserved = reserved;
        }

        public int getRadNr() {
            return radNr;
        }

        public void setRadNr(int radNr) {
            this.radNr = radNr;
        }



        public String getPlatsTyp() { return platsTyp; }

        public void setPlatsTyp(String platsTyp) {
            this.platsTyp = platsTyp;
        }





}



//Sittplats
//Array: StolsNr, Boolean Reserved, Bool Booked, ExtraPris

