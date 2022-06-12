public class Griffindor extends Hogwarts {

    int nobility ;
    int honor ;
    int bravery ;

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
}
