public class KontoBiljett extends PrisDecorator {

    public KontoBiljett(EventInterface e){
        super(e);
    }

    @Override
    public double pris(){
        return super.pris()+10;}
        
   /* EventImplementation add;

    public KontoBiljett(EventImplementation add){this.add = add;}

    public double pris(){
        return add.pris() + 0;
    }*/
 /*   EventInterface event;
    public KontoBiljett (EventInterface event){this.event = event;}

    @Override
    public double pris(){return EventInterface.pris() + 10;}
*/

}