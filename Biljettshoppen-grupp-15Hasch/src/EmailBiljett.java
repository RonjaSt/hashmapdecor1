public class EmailBiljett extends PrisDecorator{

    public EmailBiljett(EventInterface e){
        super(e);
    }

    @Override
    public double pris(){

      return super.pris()+ 10;

    }
   /* EventImplementation add;

        public EmailBiljett(EventImplementation add){this.add = add;}

        public double pris(){
            return add.pris() + 10;
        }*/
     /*EventInterface event;
    public EmailBiljett (EventInterface event){this.event = event;}

    @Override
    public double pris(){return EventInterface.pris() + 0;} */
}
