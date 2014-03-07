/**
 * Created by Travis on 3/6/14.
 */
public class Equipment {

    private String name;
    private int weight;

    public Equipment(String cName)
    {
        name = validEquip(cName);
        weight = calcWeight(name);
    }

    private String validEquip(String name)
    {
        CinReader sc = new CinReader();
        while (true)
        {
            if (name.equalsIgnoreCase("candles"))
            {
                break;
            }
            else if (name.equalsIgnoreCase("crowbars"))
            {
                break;
            }
            else if (name.equalsIgnoreCase("rope"))
            {
                break;
            }
            else if (name.equalsIgnoreCase("torches"))
            {
                break;
            }
            else if (name.equalsIgnoreCase("Shovels"))
            {
                break;
            }
            else
            {
                System.out.println("Please enter a valid item" +
                        "candles, crowbars, rope, torches shovels");
                name = sc.readString(false);

            }
        }
        return name;
    }

    private int calcWeight(String name)
    {
        int weight = 1;
        return weight;
    }

    public int getWeight()
    {
        return this.weight;
    }
}
