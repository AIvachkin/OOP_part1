public class PuffinduyStudents extends HogwartsStudent{

    private int diligence ;
    private int loyalty ;
    private int honesty ;

    public PuffinduyStudents(String name, int powerOfMagic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, powerOfMagic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int ability() {
        return diligence + loyalty + honesty ;
    }

    public void comparePuffinduyStudents(PuffinduyStudents puffinduyStudents) {
        int ability1 = ability() ;
        int ability2 = puffinduyStudents.ability() ;

        if (ability1 > ability2){
            System.out.printf("Студент Пуффендуя %s лучше студента Пуффендуя %s (%d VS %d) %n",
                    getName(), puffinduyStudents.getName(), ability1, ability2 ) ;

        }
        else if (ability1 < ability2) {
            System.out.printf("Студент Пуффендуя %s лучше студента Пуффендуя %s (%d VS %d) %n",
                    puffinduyStudents.getName(), getName(), ability2, ability1 ) ;
        }
        else {
            System.out.printf("Студент Пуффендуя %s такой же, как студент Пуффендуя %s (%d VS %d) %n",
                    puffinduyStudents.getName(), getName(), ability2, ability1 ) ;
        }
    }

    @Override
    public String toString() {
        return String.format("%s, трудолюбие - %d, верность - %d, честность - %d",
                super.toString(), diligence, loyalty, honesty) ;
    }
}
