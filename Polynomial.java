import java.lang.Math;
public class Polynomial{
    public double coefficient[];

    public Polynomial(){
        this.coefficient = new double[1];
        coefficient[0] = 0;
    }

    public Polynomial(double[] poly){
        coefficient = new double[poly.length];
        for (int i = 0; i < poly.length; i++){
            coefficient[i] = poly[i];
        }
    }

    public Polynomial add(Polynomial p2){
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


        public double evaluate(double x){
            double ans = 0;
            
            for (int i=0; i < coefficient.length;i++){
                ans += (coefficient[i] * Math.pow(x, i));
            }
            return ans;
    }

        public boolean hasRoot(double x){
            if (this.evaluate(x) == 0){
                return true;
            }
            else{
                return false;
            }
            
        }
}


