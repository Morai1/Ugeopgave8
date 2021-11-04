package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DTU_Simple DTU = new DTU_Simple();
        while (true) {
            DTU.menu();
            System.out.println();
            Scanner sc = new Scanner(System.in);


            int selected;
            for (selected = sc.nextInt(); selected > 4 || selected < 0; selected = sc.nextInt()) {
                System.out.print("Option entered invalid, please enter a number from 1 to 4: ");
            }

            if (selected == 4) {
                System.out.println("Du har afleveret");
                break;
            }
            DTU.Option(selected);
        }
    }
}