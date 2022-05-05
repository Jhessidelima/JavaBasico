public class EqXnegativo extends Equacao{
    
    private double x2;

    public void setX2(double x2) {
        this.x2 = x2;
    }
    public double getX2() {
        return x2;
    }

    public double calculaXnegativo(double a, double b, double c, double delta){
        super.setA(a);
        super.setB(b);
        super.setC(c);

        this.x2 = ((-super.getB() - Math.sqrt(delta))/(2*super.getA()));
        return this.x2;
    }
    
}
