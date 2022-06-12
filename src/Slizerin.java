public class Slizerin extends Hogwarts{

    private int cunning ;
    private int determination ;
    private int ambition ;
    private int resourcefulness ;
    private int thirstForPower ;

    public Slizerin(String name, String surname, int powerOfMagic, int transgression,
                    int cunning, int determination, int ambition,
                    int resourcefulness, int thirstForPower) {
        super(name, surname, powerOfMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public void print(Slizerin name) {
        System.out.println(
                name.getName() + " " +
                        name.getSurname() + ": Сила магии - " +
                        name.getPowerOfMagic() + "; Трансгрессия - " +
                        name.getTransgression() + "; Хитрость - " +
                        name.getCunning() + "; Решительность - " +
                        name.getDetermination() + "; Амбициозность - " +
                        name.getAmbition() + "; Находчивость - " +
                        name.getResourcefulness() + "; Жажда власти - " +
                        name.getThirstForPower()

        );
    }

    public void comparison (Slizerin name) {
        int sum = name.getAmbition() + name.getThirstForPower() + name.getResourcefulness() +
                name.getDetermination() + name.getCunning();
        int sum2 = this.getAmbition() + this.getCunning() + this.getDetermination() +
                this.getResourcefulness() + this.getThirstForPower();
        if (sum > sum2) {
            System.out.println(name.getName() + " " + name.getSurname() +
                    " - лучший Слизерианец, чем " + this.getName() +
                    " " + this.getSurname());
        } else System.out.println(this.getName() + " " + this.getSurname() +
                " - лучший Слизерианец, чем " + name.getName() +
                " " + name.getSurname())
                ;
    }
}
