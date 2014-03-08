/**
 * Created by Travis on 3/6/14.
 */
public class Backpack {
    private Canteen canteen;
    private Equipment equipment[];

    CinReader sc = new CinReader();

    public Backpack()
    {
        equipment = new Equipment[0];
    }

    public void addCanteen(Canteen e)
    {
        canteen = e;
    }

    public void addEquipment(Equipment e)
    {
        Equipment[] newEquip = new Equipment[this.equipment.length + 1];
        if (this.equipment.length > 0)
        {
            System.arraycopy(this.equipment, 0, newEquip, 0, this.equipment.length);
        }
        newEquip[newEquip.length - 1] = e;
        this.equipment = newEquip;
    }

    public void listEquipment()
    {
        for (int i = 0; i < equipment.length;i++)
        {
            System.out.println(equipment[i].getName());
        }
    }

    private Equipment[] removeEquipment( Equipment[] original, int index){
        Equipment[] newArray = new Equipment[original.length - 1];
        System.arraycopy(original, 0, newArray, 0, index);
        System.arraycopy(original, index + 1, newArray, index, original.length - index-1);
        return newArray;
    }

    private void removeCanteen()
    {

    }

    public void getWeight()
    {
        double weight = 0;
        for (int i = 0; i < equipment.length;i++)
        {
            weight += equipment[i].getWeight();
        }
        if (canteen.getPercentFull() == 100)
        {
            weight += .25;
        }
        System.out.println("Your pack weights this much: " + weight + " lbs");
    }
}
