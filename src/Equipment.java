/**
 * Created by Travis on 3/6/14.
 */
public class Equipment {

    private String name;
    private int weight;

    public Equipment(String cName, int cWeight)
    {
        name = cName;
        weight = cWeight;
    }

    public String getName() {
        return name;
    }

    public int getWeight()
    {
        return this.weight;
    }
}
