public class Warrior extends Hero{
    @Override
    public void applySuperAbility() {
        setSuperAbility("FATILITY");
        System.out.println("Warrior was used " + getSuperAbility());
    }
}
