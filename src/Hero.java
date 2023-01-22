public abstract class Hero implements HavingSuperAbility{
    private int Health;
    private int Damage;
    private String SuperAbility;



    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String getSuperAbility() {
        return SuperAbility;
    }

    public void setSuperAbility(String superAbility) {
        SuperAbility = superAbility;
    }

    @Override
    public void applySuperAbility() {

    }
}





