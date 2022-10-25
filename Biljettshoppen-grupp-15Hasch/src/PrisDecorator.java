public abstract class PrisDecorator implements EventInterface{
    protected EventInterface add;

    public PrisDecorator( EventInterface e){
        this.add=e;

    }


    @Override
    public double pris(){
        return this.add.pris();
    }
}
