package Data;

public class Data1 {
    public static double f(double x, double y)
    {
        return (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - 2 * x / (1 + Math.pow(x*y,2)))) + x;
    }
}
