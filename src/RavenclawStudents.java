public class RavenclawStudents extends HogwartsStudent {
    private int intelligence ;
    private int wisdom ;
    private int wit ;
    private int creativity ;

    public RavenclawStudents(String name, int powerOfMagic, int transgression, int intelligence, int wisdom, int wit, int creativity) {
        super(name, powerOfMagic, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public int ability() {
        return intelligence + wisdom + wit + creativity ;
    }

    public void compareRavenclawStudents(RavenclawStudents ravenclawStudents) {
        int ability1 = ability() ;
        int ability2 = ravenclawStudents.ability() ;

        if (ability1 > ability2){
            System.out.printf("Студент Когтеврана %s лучше студента Когтеврана %s (%d VS %d) %n",
                    getName(), ravenclawStudents.getName(), ability1, ability2 ) ;

        }
        else if (ability1 < ability2) {
            System.out.printf("Студент Когтеврана %s лучше студента Когтеврана %s (%d VS %d) %n",
                    ravenclawStudents.getName(), getName(), ability2, ability1 ) ;
        }
        else {
            System.out.printf("Студент Когтеврана %s такой же, как студент Когтеврана %s (%d VS %d) %n",
                    ravenclawStudents.getName(), getName(), ability2, ability1 ) ;
        }
    }

    @Override
    public String toString() {
        return String.format("%s, ум - %d, мудрость - %d, сообразительность - %d, творество - %d",
                super.toString(), intelligence, wisdom, wit, creativity) ;
    }
}
