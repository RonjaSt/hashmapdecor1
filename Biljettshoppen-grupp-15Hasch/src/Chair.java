public class Chair extends PrisDecorator {

    //PrisDecorator add;

    public Chair(EventInterface e){
        super(e);
    }

    @Override
    public double pris(){
        return super.pris()+40;
        
        


    }
    /*
      return add.pris() + 10;
    EventInterface event;
    public Chair (EventInterface event){this.event = event;}
    @Override
    public double pris(){return .pris() + 40;} */
}
