public class EqXpositivo extends Equacao {
    private double x1;

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX1() {
        return x1;
    }

    public double calculaXpositivo(double a, double b, double c, double delta){
        super.setA(a);
        super.setB(b);
        super.setC(c);

        this.x1 = ((-super.getB() + Math.sqrt(delta))/(2*super.getA()));
        return this.x1;
    }
}
