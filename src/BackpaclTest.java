/**
 * Created by Travis on 3/7/14.
 */
public class BackpaclTest {

    public static void main(String[] args)
    {
        Backpack bP0 = new Backpack();
        Canteen cT = new Canteen();

        cT.fill();

        Equipment eQ0 = new Equipment("candles", 2);
        Equipment eQ1 = new Equipment("crowbars", 8);
        Equipment eQ2 = new Equipment("torches", 4);

        bP0.addCanteen(cT);

        bP0.addEquipment(eQ0);

        bP0.listEquipment();

        bP0.addEquipment(eQ1);

        bP0.listEquipment();

        bP0.addEquipment(eQ2);

        bP0.listEquipment();
        bP0.listEquipment();

        Backpack bP1 = new Backpack();
        Backpack bP2 = new Backpack();
        Backpack bP3 = new Backpack();
        Backpack bP4 = new Backpack();

        bP0.getWeight();
    }
}
