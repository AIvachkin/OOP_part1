import java.util.Random;

public class Main {
    public static void main(String[] args) {

        GryffindorStudents harry = generateGryffindorStudent("Harry Potter");
        GryffindorStudents germiona = generateGryffindorStudent("Germiona Granger");
        GryffindorStudents ron = generateGryffindorStudent("Ron Wisley");
        SlyzerinStudents drako = generatelyzerinStudent("Drako Malfoy");
        SlyzerinStudents gragham = generatelyzerinStudent("Gragham Montegyu");
        SlyzerinStudents gregory = generatelyzerinStudent("Gregory Goyle");
        PuffinduyStudents zakharia = generatePuffinduyStudent("Zakharia Smith");
        PuffinduyStudents sedrick = generatePuffinduyStudent("Sedrick Diggery");
        PuffinduyStudents jastine = generatePuffinduyStudent ("Jastine Finch-Fletchie");
        RavenclawStudents jou = generateRavenclawStudent("Jou Chang");
        RavenclawStudents padma = generateRavenclawStudent ("Padma Patil");
        RavenclawStudents markus = generateRavenclawStudent("Markus Belbi");

        harry.print();
        drako.print();
        jastine.print();
        padma.print();

        harry.compareGryffindorStudents(ron);
        harry.compareHogartsStudents(drako);

        sedrick.comparePuffinduyStudents(jastine);
        markus.compareHogartsStudents(germiona);

    }

    private static GryffindorStudents generateGryffindorStudent (String name){
        Random r = new Random();
        return new GryffindorStudents(
                name,
                r.nextInt(100),
                r.nextInt(100),
                r.nextInt(100),
                r.nextInt(100),
                r.nextInt(100)

        ) ;
    }

    private static PuffinduyStudents generatePuffinduyStudent (String name){
        Random r = new Random();
        return new PuffinduyStudents(
                name,
                r.nextInt(100),
                r.nextInt(100),
                r.nextInt(100),
                r.nextInt(100),
                r.nextInt(100)

        ) ;
    }
    private static RavenclawStudents generateRavenclawStudent (String name){
        Random r = new Random();
        return new RavenclawStudents(
                name,
                r.nextInt(100),
                r.nextInt(100),
                r.nextInt(100),
                r.nextInt(100),
                r.nextInt(100),
                r.nextInt(100)

        ) ;
    }

    private static SlyzerinStudents generatelyzerinStudent (String name){
        Random r = new Random();
        return new SlyzerinStudents(
                name,
                r.nextInt(100),
                r.nextInt(100),
                r.nextInt(100),
                r.nextInt(100),
                r.nextInt(100),
                r.nextInt(100),
                r.nextInt(100)

        ) ;
    }


}