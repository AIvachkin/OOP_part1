public class GryffindorStudents extends HogwartsStudent {

    private int nobility ;
    private int honor ;
    private int bravery ;

    public GryffindorStudents(String name, int powerOfMagic, int transgression, int nobility,
                              int honor, int bravery) {
        super(name, powerOfMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int ability() {
        return nobility + honor + bravery ;
    }

    public void compareGryffindorStudents(GryffindorStudents gryffindorStudents) {
        int ability1 = ability() ;
        int ability2 = gryffindorStudents.ability() ;
        if (ability1 > ability2){
            System.out.printf("Студент Гриффиндора %s лучше студента Гриффиндора %s (%d VS %d) %n",
                    getName(), gryffindorStudents.getName(), ability1, ability2 ) ;
//            в наследнике вызываем метод базового класса - getName()

        }
        else if (ability1 < ability2) {
            System.out.printf("Студент Гриффиндора %s лучше студента Гриффиндора %s (%d VS %d) %n",
                    gryffindorStudents.getName(), getName(), ability2, ability1 ) ;
        }
        else {
            System.out.printf("Студент Гриффиндора %s такой же, как студент Гриффиндора %s (%d VS %d) %n",
                    gryffindorStudents.getName(), getName(), ability2, ability1 ) ;
        }
    }

    @Override
    public String toString() {
        return String.format("%s, благородство - %d, честь - %d, храбрость - %d",
                super.toString(), nobility, honor, bravery) ;
    }
}

