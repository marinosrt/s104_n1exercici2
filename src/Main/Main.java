package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String numDni;
        System.out.println("Digues el teu número de dni");
        numDni = sc.nextLine();
        CalculoDNI dni = new CalculoDNI();
        System.out.println(numDni + dni.getDNI(numDni));

    }
}