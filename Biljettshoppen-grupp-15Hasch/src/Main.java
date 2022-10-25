import java.util.HashMap;
    import java.util.Random;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rand = new Random((10000) + 1000);
        int upperbound = 10000;

        //EventInterface cost = new Chair(new EventImplementation());

        /*
        }); */

        EventInterface shittyDay = new Chair(new EmailBiljett(new Bench(new Insurance(new KontoBiljett(new FysiskBiljett(new EventImplementation()))))));

        //System.out.println(shittyDay.pris() + "kr");

        shittyDay = new Chair(new EmailBiljett(new Bench(new Insurance(new KontoBiljett(new FysiskBiljett(new EventImplementation()))))));
        //shittyDay = new EmailBiljett(new EventImplementation());
        //shittyDay = new Chair(new EventImplementation());
        System.out.println(shittyDay.pris() + "kr");
        //cost = new Biljett(new EventImplementation());
        //cost = new Bench(new EventImplementation());
        //cost = new Insurance(new EventImplementation());
        //cost = new EmailBiljett(new EventImplementation());
        //cost = new FysiskBiljett(new EventImplementation());
        //cost = new KontoBiljett(new EventImplementation());

        /*test2 = new Chair(new EventImplementation());
        test2 = new Bench (new EventImplementation());*/
        //System.out.println(cost.pris() + "kr");

    /*EventInterface test1 = new EventImplementation();
        test1 = new Chair(test1);
        System.out.println(test1.pris() + "kr");*/

   // EventInterface test2 = new EventImplementation();



       /* EventInterface event = new Biljett();
        event = new Biljett(event);
        event = new Chair(event);
        event = new FysiskBiljett(event);
        System.out.println(event.pris() + "kr");
        System.out.println(EventInterface.pris() + "kr");*/
        //System.out.println(event.valueName());




        Sittplats sittplats1 = new Sittplats(1, 0, 0, 1, "bänk");
        Sittplats sittplats2 = new Sittplats(2, 0, 0, 1, "bänk");
        Sittplats sittplats3 = new Sittplats(3, 0, 0, 1, "bänk");
        Sittplats sittplats4 = new Sittplats(4, 0, 0, 1, "bänk");
        Sittplats sittplats5 = new Sittplats(5, 0, 0, 1, "bänk");


        HashMap<Integer, Integer> demo2 = new HashMap<>();

        demo2.put(sittplats1.getStolNr(), sittplats1.getBooked());
        demo2.put(sittplats2.getStolNr(), sittplats2.getBooked());
        demo2.put(sittplats3.getStolNr(), sittplats3.getBooked());
        demo2.put(sittplats3.getStolNr(), sittplats4.getBooked());
        demo2.put(sittplats5.getStolNr(), sittplats5.getBooked());


        System.out.println(demo2);
        Kund test = new Kund();
        booking1(test, demo2);

       /* System.out.println("What seat do you want to look at? please type number");
        int x = input.nextInt();
        if (demo2.containsKey(x)) {
            System.out.println("Hashmap contains value");*/
        //}//end if


    }//end main

    public static void booking1(Kund tempkund, HashMap <Integer, Integer> demo2) { //booknings metoden
        //EventInterface event
        boolean running = true;
        int runnStage = 1;
        String command;
        Scanner inputX = new Scanner(System.in);

        while (running) {
            if (runnStage == 1) {
                System.out.println("\nHej vill du boka en biljett?" +
                        "\n1: Boka ny biljett" +
                        "\n0: Avsluta programmet");
                command = inputX.nextLine();
                System.out.println();
                switch (command) {//switch 1
                    case "1":
                        runnStage = 2;
                        break;
                    case "0":
                        runnStage = 1;
                        running = false;
                        break;

                }//end switch 1
            }//end if stage1
            //String email, String namn, String personNr
            else if (runnStage == 2) {//running stage 2, tar in email,namn och personnr för kund.
                System.out.println("\nSkriv in din email address:");
                String email = inputX.nextLine();
                System.out.println("\nSkriv in din För och efter namn:");
                String namn = inputX.nextLine();
                System.out.println("\nSkriv in din personnummer enligt följande yy-mm-dd-xxxx:");
                String persnnr = inputX.nextLine();
                tempkund.setPersonNr(persnnr);
                tempkund.setEmail(email);
                tempkund.setNamn(namn);
                runnStage = 3;
            }//if runnstage 2
            else if (runnStage == 3) {//start runnstage 3
                ticketOrder(demo2);
                //event
                runnStage = 4;
            }//end if runnstage 3
            else if(runnStage == 4){//start runnstage 4
                System.out.println("\nVill du boka en till biljett?" +
                        "\n1: Ja - boka en till" +
                        "\n2: Nej - avsluta");
                command = inputX.nextLine();
                switch(command){
                    case "1":
                        runnStage = 3;
                        break;
                    case "2":
                        running = false;
                        break;
                }//end switch
            }//end else if 4
        }//end while
    }//end booking

    public static void ticketOrder(HashMap <Integer, Integer> demo2) { // ta in hashmap
        //EventInterface event  låg i input på metod
        boolean running = true;
        int runnStage = 1;
        String command;
        int bokaplats = 0;
        Scanner inputX = new Scanner(System.in);


        while (running) {
            if (runnStage == 1) {
                System.out.println("\nVilken plats vill du boka? :");
                command = inputX.nextLine();
                bokaplats = Integer.parseInt(command);
                if (demo2.containsKey(bokaplats)) { //checka i hasmap om platsen finnhasgs.
                    int a = (int) demo2.get(bokaplats);

                    if (a == 0) {//om den inte är bokad dvs 0
                        System.out.println("du reserverar denna platsen");
                        //event = new Biljett(event);
                        runnStage = 2;
                    }
                    else {
                        System.out.println("\nDenna plats är bokad. Välj en ny tack.");
                    }
                }
                else {
                    System.out.println("\nDenna plats finns inte.");
                }
            }//end if-runnstage1
            else if (runnStage == 2) {
                System.out.println("\nVäl vad för slags plats: " +
                        "\n1: Stol" +
                        "\n2: Bänk" +
                        "\n0: Avsluta");
                command = inputX.nextLine();
                System.out.println();

                switch (command) {  //end switch 2
                    case "1":
                        //event = new Chair(event);
                        runnStage = 3;
                        break;
                    case "2":
                        //event = new Bench(event);
                        runnStage = 3;
                        break;
                    case "0":
                        running = false;
                        break;
                    default:
                        System.out.println("Ogiltlig input");
                }//end switch 2
            }//end runstage 2
            else if (runnStage == 3) {
                System.out.println("\nVälj leverans sätt av biljett " +
                        "\n1: Fysisk Biljett" +
                        "\n2: Email Biljett" +
                        "\n3: Konto Biljett" +
                        "\n0: Avsluta");
                command = inputX.nextLine();
                System.out.println();

                switch (command) {
                    case "1":
                        //event = new FysiskBiljett(event);
                        runnStage = 4;
                        break;
                    case "2":
                        //event = new EmailBiljett(event);
                        runnStage = 4;
                        break;
                    case "3":
                        //event = new KontoBiljett(event);
                        runnStage = 4;
                        break;
                    case "0":
                        running = false;
                        break;
                    default:
                        System.out.println("Ogiltlig input");
                }//end switch 3

            }//end else 3
            else if (runnStage == 4) {
                System.out.println("\nFörsäkra din biljett? " +
                        "\n1: Ja - försäkra" +
                        "\n2: Nej - ingen försäkring" +
                        "\n0: Avsluta");
                command = inputX.nextLine();
                System.out.println();

                switch (command) {
                    case "1":
                        //event = new Insurance(event);
                        demo2.put(bokaplats, 1);
                        //System.out.println("Du har bokat plats :" + bokaplats + " den kostar dig :" + EventInterface.pris() + "kr");
                        running = false;
                        break;
                    case "2":
                        demo2.put(bokaplats, 1);
                        //System.out.println("Du har bokat en plats: "+bokaplats+" den kostar dig :"+EventInterface.pris() + "kr");
                        running = false;
                        break;
                    case "0":

                        running = false;
                        break;
                    default:
                        System.out.println("Ogiltlig input");
                }//end switch 4

            }//end else 4

        }//end while


    }//end ticketOrder


}//end class

