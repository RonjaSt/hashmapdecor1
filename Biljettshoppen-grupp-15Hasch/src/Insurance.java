public class Insurance extends PrisDecorator{
    public Insurance(EventInterface e){
        super(e);
    }

    @Override
    public double pris(){
        return super.pris()+50;}
        

  /*  EventImplementation add;

    public Insurance(EventImplementation add){this.add = add;}

    public double pris(){
        return add.pris() + 50;*
        }/
   */
     /*  EventInterface event;
    public Insurance (EventInterface event){this.event = event;}

    @Override
    public double pris(){return EventInterface.pris() + 50;}*/
}


