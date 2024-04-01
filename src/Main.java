import Personage.Personage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        exercise1_1();
        exercise1_2();
    }

    public static void exercise1_1() throws InterruptedException {
        welcome();
        waiting();
        subsectionAAndB();
        waiting();
        subSectionC();
    }

    public static void exercise1_2(){
        World_of_Warcraft world = new World_of_Warcraft();

        //world.moreHordesAlliance();
        //world.PersonageLessVictory();
        //world.quantityPersonagesByBreed();
        //world.winnerDuel();
    }

    private static void welcome() {
        println(" ___________________________________________________________________________________________________");
        println("|                                                                                                   |");
        println("|  0   0  OOO  0000  0     0000     OOO  0000   0   0    0   0000    0000  0000     0   0000  00000 |");
        println("|  0 0 0 O   O 0   0 0     0   0   O   O 0      0   0   0 0  0   0  0      0   0   0 0  0       0   |");
        println("|  0 0 0 O   O 0000  0     0   0   O   O 000    0 0 0  00000 0000   0      0000   00000 000     0   |");
        println("|  0 0 0 O   O 0 0   0     0   0   O   O 0      0 0 0  0   0 0 0    0      0 0    0   0 0       0   |");
        println("|   0 0   OOO  0  00 0000  0000     OOO  0       0 0   0   0 0  00   0000  0  00  0   0 0       0   |");
        println("|                                                                                                   |");
        println(" ---------------------------------------------------------------------------------------------------");
    }

    private static void subsectionAAndB() {
        Scanner sc = new Scanner(System.in);
        Personage personage = new Personage();

        println("\nEJERCICIO 1.1");
        println("\nElaborando inciso a y b .....");

        println("\n--Para comenzar debe crear su personaje.\n");

        println("* Nombre *");
        personage.setId(sc.nextLine());

        personage.setBreed(validateBreed(sc));

        personage.setEnergyLevel(200);
        personage.setOffensiveCapacity(200);
        personage.setDefensiveCapacity(100);

        sc.close();

        println("\n" + personage);
    }

    private static void subSectionC(){
        println("\043[0;34m" + "\nElaborando inciso c ..... \n" + "\033[0m");
        println(new Personage("Durotán", 'O', 125, 145, 58).toString());
    }

    private static void println(String text) {
        System.out.println(text);
    }

    private static char validateBreed(Scanner sc) {
        println("\n--Seleccione la raza.\n");
        println("Humanos “H”");
        println("Elfos “F”");
        println("Enanos “E”");
        println("Trolls “T”");
        println("Orcos “O”");
        println("Muertos “M”");
        println("\033[0;34m" + "NOTA: Solo escriba la letra representada."  + "\033[0m" + "\n");

        String breed;
        do {
            println("* Raza *");
            breed = sc.nextLine().toUpperCase();

            switch (breed) {
                case "H","F","E","T","O","M":
                    return breed.charAt(0);
            }

        } while (true);
    }

    private static void waiting() throws InterruptedException {
        Thread.sleep(2000);
    }
}
