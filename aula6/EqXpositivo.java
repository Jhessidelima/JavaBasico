public class EqXpositivo {
    private double x1;

    public double calculaXpositivo(Delta delta){
        this.x1 = ((-delta.getB() + Math.sqrt(delta.getDelta()))/(2*delta.getA()));
        return this.x1;
    }
}
