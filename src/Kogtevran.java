public class Kogtevran extends Hogwarts {

    private int intelligence ;
    private int wisdom ;
    private int wit ;
    private int creativity ;

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

    public void print(Kogtevran name) {
        System.out.println(
                name.getName() + " " +
                        name.getSurname() + ": Сила магии - " +
                        name.getPowerOfMagic() + "; Трансгрессия - " +
                        name.getTransgression() + "; Ум - " +
                        name.getIntelligence() + "; Мудрость - " +
                        name.getWisdom() + "; Остроумие - " +
                        name.getWit() + "; Творчество - " +
                        name.getCreativity()
        );
    }

    public void comparison (Kogtevran name) {
        int sum = name.getCreativity() + name.getWit() + name.getWisdom() +
                name.getIntelligence() ;
        int sum2 = this.getCreativity() + this.getWit() + this.getWisdom() +
                this.getIntelligence() ;
        if (sum > sum2) {
            System.out.println(name.getName() + " " + name.getSurname() +
                    " - лучший Когтевранец, чем " + this.getName() +
                    " " + this.getSurname());
        } else System.out.println(this.getName() + " " + this.getSurname() +
                " - лучший Когтевранец, чем " + name.getName() +
                " " + name.getSurname())
                ;
    }
}


