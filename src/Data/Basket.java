package Data;

import java.util.ArrayList;

public class Basket
{
    public ArrayList<Ball> balls= new ArrayList<Ball>();
    public Basket()
    {

    }
    public void add(Ball ball)
    {
        balls.add(ball);
    }
    public int countOf(String color)
    {
        int count = 0;
        for (int i = 0; i < balls.size(); i++)
            if (balls.get(i).color == color)
                count++;
        return count;
    }
    public double sumWeight()
    {
        double sumWeight = 0;
        for (int i = 0; i < balls.size(); i++)
            sumWeight += balls.get(i).weight;
        return sumWeight;
    }
}