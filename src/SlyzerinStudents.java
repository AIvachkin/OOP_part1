public class SlyzerinStudents extends HogwartsStudent{

    private int cunning ;
    private int determination ;
    private int ambition ;
    private int resourcefulness ;
    private int thirstForPower ;

    public SlyzerinStudents(String name, int powerOfMagic, int transgression, int cunning,
                            int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, powerOfMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public int ability() {
        return cunning + determination + ambition + resourcefulness + thirstForPower ;
    }

    public void compareSlyzerinStudents(SlyzerinStudents slyzerinStudents) {
        int ability1 = ability() ;
        int ability2 = slyzerinStudents.ability() ;

        if (ability1 > ability2){
            System.out.printf("Студент Слизерина %s лучше студента Слизерина %s (%d VS %d) %n",
                    getName(), slyzerinStudents.getName(), ability1, ability2 ) ;

        }
        else if (ability1 < ability2) {
            System.out.printf("Студент Слизерина %s лучше студента Слизерина %s (%d VS %d) %n",
                    slyzerinStudents.getName(), getName(), ability2, ability1 ) ;
        }
        else {
            System.out.printf("Студент Слизерина %s такой же, как студент Слизерина %s (%d VS %d) %n",
                    slyzerinStudents.getName(), getName(), ability2, ability1 ) ;
        }
    }

    @Override
    public String toString() {
        return String.format(
                "%s, хитрость - %d, решительность - %d, амбициозность - %d, находчивость - %d, жажда власти - %d",
                super.toString(), cunning, determination, ambition, resourcefulness, thirstForPower) ;

    }
}
