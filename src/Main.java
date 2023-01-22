public class Main {
    public static void main(String[] args) {

        HavingSuperAbility[] AllHeroes = {new Warrior(), new Magic(), new Medic()};
        for (int i = 0; i < AllHeroes.length; i++) {
            AllHeroes[i].applySuperAbility();
            if (AllHeroes[i] instanceof Medic) {
                ((Medic) AllHeroes[i]).setHealPoints(15);

                ((Medic) AllHeroes[i]).increaseExperience();
            }

        }
    }
}