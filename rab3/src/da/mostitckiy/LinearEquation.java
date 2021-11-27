package da.mostitckiy;

import java.util.ArrayList;

public class LinearEquation {
    protected ArrayList<Double> x;

    public ArrayList<Double> solution(double a, double b) {
        if(a==0) {
          return null;
        }
        System.out.println("а");
        x = new ArrayList<>();
        x.add(-b / a);
        return x;
    }
}
