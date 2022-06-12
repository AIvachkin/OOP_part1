public class Kogtevran extends Hogwarts {

    int intelligence ;
    int wisdom ;
    int wit ;
    int creativity ;

    public Kogtevran(String name, String surname,int powerOfMagic, int transgression,
                     int intelligence, int wisdom, int wit,
                     int creativity) {
        super(name, surname, powerOfMagic, transgression);
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
}


