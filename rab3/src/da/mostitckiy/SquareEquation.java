package da.mostitckiy;

import da.core.EquationInterface;
import java.util.ArrayList;

public class SquareEquation extends LinearEquation implements EquationInterface {

    @Override
    public ArrayList<Double> solve(double a, double b, double c) {
        if (a == 0) {
            return  x = solution(b, c);
        }
        double sqrt = discriminant(a, b, c);
        if (sqrt < 0) {
        }
        if (sqrt == 0){
            x.add((-b) / (2 * a));
            return x;
        }
        x = new ArrayList<>();
        x.add((-b + Math.sqrt(sqrt)) / (2 * a));
        x.add((-b - Math.sqrt(sqrt)) / (2 * a));
        return x;
    }

    protected Double discriminant(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }
}
