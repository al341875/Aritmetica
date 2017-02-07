package lineal;

/**
 * Created by al341875 on 7/02/17.
 */
public class ecuacionLineal {
    private double a;
    private double b;

    public ecuacionLineal(double a,double b){
        this.a = a;
        this.b = b;
    }
    public SolucionUnica resolverEcuacionLineal(){
        return  new SolucionUnica((-b)/a);
    }
}
