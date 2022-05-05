public class Delta extends Equacao {
    
    private double delta; 

    public void setDelta(double delta) {
        super.setDelta(delta);
    }
    public double getDelta() {
        return super.getDelta();
    }

    //#region Regra de Calculo do Delta.
    public double calculaDelta(double a, double b, double c){
        super.setA(a);
        super.setB(b);
        super.setC(c);

        this.delta = (Math.pow(super.getB(), 2) - (4*super.getA()*super.getC()));

        return this.delta;
    }
    //#endregion
}
