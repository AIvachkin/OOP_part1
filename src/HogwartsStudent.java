import java.sql.SQLOutput;

public abstract class HogwartsStudent {

    private String name;
    private int powerOfMagic;
    private int transgression;

    public HogwartsStudent(String name, int powerOfMagic, int transgression) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return String.format("Студент Хогвартса: %s, сила магии -  %d, сила трансгрессии -  %d, ",
                name, powerOfMagic, transgression) ;
    }

    private int abilityHogwartsStudents() {
//        способность
        return powerOfMagic + transgression ;
    }

    public void compareHogartsStudents(HogwartsStudent hogwartsStudent) {
//        усли сделать статичным, то метод
//        должен принимать 2 значения - 2х студентов
//        Метод нестатичный, живет в контексте объекта. Т.е. по умолчанию будет this
        int ability1 = abilityHogwartsStudents() ; // для this
        int ability2 = hogwartsStudent.abilityHogwartsStudents() ; // для принимаемого объекта
        if (ability1 > ability2){
            System.out.printf("Студент Хогвартса %s лучше студента Хогвартса %s (%d VS %d) %n",
                    name, hogwartsStudent.name, ability1, ability2 ) ;
        }
        else if (ability1 < ability2) {
            System.out.printf("Студент Хогвартса %s лучше студента Хогвартса %s (%d VS %d) %n",
                    hogwartsStudent.name, name, ability2, ability1 ) ;
        }
        else {
        System.out.printf("Студент Хогвартса %s такой же, как студент Хогвартса %s (%d VS %d) %n",
                hogwartsStudent.name, name, ability2, ability1 ) ;
    }
}
    public void print (){
        System.out.println(this);
//        этот метод будет наследоваться у каждого студента,но toString
//        у каждого разный - идентификация по this
    }

}
