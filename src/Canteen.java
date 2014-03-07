/**
 * Created by Travis on 3/6/14.
 */
public class Canteen {
    //test
    private double maxVolume; //in cups
    private int percentFull;

    public Canteen()
    {
        maxVolume = 8;
        percentFull = 0;
    }

    public Canteen(double cMaxVolue, int cPercentFull)
    {
        maxVolume = cMaxVolue;
        percentFull = cPercentFull;
    }

    public void fill()
    {
        this.percentFull = 100;
    }

    public void empty()
    {
        this.percentFull = 0;
    }

    public void sip()
    {
        this.percentFull -= 1;
    }

    public void sip(int cSip)
    {
        this.percentFull -= cSip;
    }

    public double getMaxVolume()
    {
        return this.maxVolume / 4;
    }

    public int getPercentFull()
    {
        return this.percentFull;
    }
}
