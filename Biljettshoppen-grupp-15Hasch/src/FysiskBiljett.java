public class FysiskBiljett extends PrisDecorator{

    public FysiskBiljett(EventInterface e){
        super(e);
    }

    @Override
    public double pris(){
        return super.pris()+25;}

    /*
    EventImplementation add;

    public FysiskBiljett(EventImplementation add){this.add = add;}

    public double pris(){
        return add.pris() + 25;
    }*/
}
