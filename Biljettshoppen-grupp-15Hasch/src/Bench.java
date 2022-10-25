public class Bench extends PrisDecorator{
    public Bench(EventInterface e){
        super(e);
    }

    @Override
    public double pris(){
        return super.pris()+40;}
        
        

   /* EventImplementation add;

    public Bench(EventImplementation add){this.add = add;}

    public double pris(){
        return add.pris() + 40;
    }*/
/*    EventInterface event;
    public Bench (EventInterface event){this.event = event;}

    @Override
    public double pris(){return EventInterface.pris() + 40;}*/


}
