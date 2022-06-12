public class Puffinduy extends Hogwarts{

    int diligence ;
    int loyalty ;
    int honesty ;

    public Puffinduy(String name, String surname, int powerOfMagic, int transgression,
                     int diligence, int loyalty,
                     int honesty) {
        super(name, surname, powerOfMagic, transgression);
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
}
