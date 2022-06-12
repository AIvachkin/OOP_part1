public class Puffinduy extends Hogwarts{

    private int diligence ;
    private int loyalty ;
    private int honesty ;

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

    public void print(Puffinduy name) {
        System.out.println(
                name.getName() + " " +
                        name.getSurname() + ": Сила магии - " +
                        name.getPowerOfMagic() + "; Трансгрессия - " +
                        name.getTransgression() + "; Трудолюбие - " +
                        name.getDiligence() + "; Верность - " +
                        name.getLoyalty() + "; Честность - " +
                        name.getHonesty()
        );
    }

    public void comparison (Puffinduy name) {
        int sum = name.getDiligence() + name.getHonesty() + name.getLoyalty() ;
        int sum2 = this.getDiligence() + this.getLoyalty() + this.getHonesty() ;
        if (sum > sum2) {
            System.out.println(name.getName() + " " + name.getSurname() +
                    " - лучший Пуффиндуец, чем " + this.getName() +
                    " " + this.getSurname());
        } else System.out.println(this.getName() + " " + this.getSurname() +
                " - лучший Пуффиндуец, чем " + name.getName() +
                " " + name.getSurname())
                ;
    }
}
