import java.lang.Math;
public class Polynomial{
    public double coefficient[];

    public Polynomial(){
        System.out.println("single construct innit");
        this.coefficient = new double[1];
        coefficient[0] = 0;
    }

    public Polynomial(double[] poly){
        System.out.println("construct innit");
        coefficient = new double[poly.length];
        for (int i = 0; i < poly.length; i++){
            coefficient[i] = poly[i];
        }
    }

    public Polynomial add(Polynomial p2){
        System.out.println("add innit");
        int len = Math.max(coefficient.length, p2.coefficient.length);
        
        double[] sum = new double[len];

        for (int i = 0; i < len; i++){
            if (i >= coefficient.length ){
                sum[i] = p2.coefficient[i];
            }
            if (i >= p2.coefficient.length ) {
                sum[i] = coefficient[i];
            }
            if (i < coefficient.length && i < p2.coefficient.length ){
                sum[i] = coefficient[i] + p2.coefficient[i];
            }
            
        }
        return new Polynomial(sum);

    }
}


