public class Griffindor extends Hogwarts {

    private int nobility ;
    private int honor ;
    private int bravery ;

    public Griffindor(String name, String surname, int powerOfMagic, int transgression,
                      int nobility, int honor, int bravery) {
        super(name, surname, powerOfMagic, transgression);
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

    public void print(Griffindor name) {
        System.out.println(
                name.getName() + " " +
                        name.getSurname() + ": Сила магии - " +
                        name.getPowerOfMagic() + "; Трансгрессия - " +
                        name.getTransgression() + "; Благородство - " +
                        name.getNobility() + "; Честь - " +
                        name.getHonor() + "; Храбрость - " +
                        name.getBravery()
        );
    }

    public void comparison (Griffindor name) {
        int sum = name.getBravery() + name.getNobility() + name.getHonor() ;
        int sum2 = this.getBravery() + this.getHonor() + this.getNobility() ;
        if (sum > sum2) {
            System.out.println(name.getName() + " " + name.getSurname() +
                    " - лучший Гриффиндорец, чем " + this.getName() +
                    " " + this.getSurname());
        } else System.out.println(this.getName() + " " + this.getSurname() +
                " - лучший Гриффиндорец, чем " + name.getName() +
                " " + name.getSurname())
        ;
    }
}
