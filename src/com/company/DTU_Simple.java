package com.company;

import java.util.Scanner;


public class DTU_Simple {

    Studerende S;
    Underviser U;

    void menu() {
        System.out.println();
        System.out.println("Menu for DTU Simple");
        System.out.println("(1) Adgang");
        System.out.println("(2) Undervisningsmaterialer");
        System.out.println("(3) Udleveringsopgaver");
        System.out.println("(4) Afleveringsopgaver");
        System.out.print("Vælg en option: ");

    }

    void Option(int Selected) {
        switch (Selected) {
            case 1:
                Adgang();
                break;
            case 2:
                Undervisningsmaterialer();
                break;
            case 3:
                Udleveringsopgaver();
                break;
            default:
                break;
        }

    }




    private void Adgang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" The number of student: ");
        int NummerafStuderende = Integer.parseInt(scanner.nextLine());
        System.out.print(" The number of Underviser: ");
        int NummerafUnderviser = Integer.parseInt(scanner.nextLine());
        S = new Studerende(NummerafStuderende);
        U = new Underviser(NummerafUnderviser);

    }

    private void Undervisningsmaterialer() {
        System.out.print(" Her lægger slides og løsningvejldning for kursus:");


    }
    private void Udleveringsopgaver() {
        System.out.println(" Her lægger jeres opgaver som skal afleveres om 10 dage");
    }
}