public class Main {


    public static void main(String[] args) {

        Griffindor harry = new Griffindor("Harry", "Potter", 60, 84,
                71, 32, 46);
        Griffindor germiona = new Griffindor("Germiona", "Granger", 71,
                95, 47, 36, 15);
        Griffindor ron = new Griffindor("Ron", "Wisley", 55, 29,
                80, 67, 44);
        Slizerin drako = new Slizerin("Drako", "Malfoy", 64, 71,
                69, 80, 100, 57, 37);
        Slizerin gragham = new Slizerin("Gragham", "Montegyu", 32, 48,
                81, 47, 12, 10, 9);
        Slizerin gregory = new Slizerin("Gregory", "Goyle", 57,
                60, 42, 47, 51, 27, 28);

        Puffinduy zakharia = new Puffinduy("Zakharia", "Smith", 71, 85,
                46, 35, 11);
        Puffinduy sedrick = new Puffinduy("Sedrick", "Diggery", 47, 10,
                67, 58, 90);
        Puffinduy jastine = new Puffinduy("Jastine", "Finch-Fletchie", 55,
                35, 78, 24, 60);
        Kogtevran jou = new Kogtevran("Jou", "Chang", 49, 87,
                44, 78, 61, 55);
        Kogtevran padma = new Kogtevran("Padma", "Patil", 70, 55,
                68, 27, 90, 47);
        Kogtevran markus = new Kogtevran("Markus", "Belbi", 87, 46,
                88, 54, 29, 11);

        harry.print(harry);
        padma.print(padma);
        drako.print(drako);
        zakharia.print(zakharia);
        harry.comparison(germiona);
        gregory.comparison(drako);
        sedrick.comparison(zakharia);
        padma.comparison(jou);
        harry.comparison(markus);


    }



}