public class EqXnegativo{
    
    private double x2;

    public double calculaXnegativo(Delta delta){
        this.x2 = ((-delta.getB() - Math.sqrt(delta.getDelta()))/(2*delta.getA()));
        return this.x2;
    }
    
}
