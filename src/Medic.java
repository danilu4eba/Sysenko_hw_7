public class Medic extends Hero{
private double HealPoints;

    public double getHealPoints() {
        return HealPoints;
    }

    public void setHealPoints(double healPoints) {
        HealPoints = healPoints;
    }

    public void increaseExperience(){
        System.out.println(getHealPoints() + getHealPoints()*0.1);


    }
    public void applySuperAbility() {
        setSuperAbility("ULTRAHILL");
        System.out.println("Medic was used " + getSuperAbility());
    }
}

