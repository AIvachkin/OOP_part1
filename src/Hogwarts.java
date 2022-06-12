public class Hogwarts {

    private String name;
    private String surname;
    private int powerOfMagic;
    private int transgression;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Hogwarts(String name, String surname, int powerOfMagic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.transgression = transgression;
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

    public void comparison (Hogwarts name) {
        int sum = name.getTransgression() + name.getPowerOfMagic() ;
        int sum2 = this.getTransgression() + this.getPowerOfMagic() ;
        if (sum > sum2) {
            System.out.println(name.getName() + " " + name.getSurname() +
                    " обладает большей мощьностью магии, чем " + this.getName() +
                    " " + this.getSurname());
        } else System.out.println(this.getName() + " " + this.getSurname() +
                " обладает большей мощностью магии, чем " + name.getName() +
                " " + name.getSurname())
                ;
    }
}
