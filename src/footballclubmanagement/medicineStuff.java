package footballclubmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class medicineStuff extends stuff {

    public medicineStuff(String name, int age, String contractNumber, int contractDuration, double salary, String department) {
        super(name, age, contractNumber, contractDuration, salary, department);
    }

    void updateFitness(ArrayList<players> plist, double b) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PLayers Name:");
        String name = sc.nextLine();
        for (players p : plist) {
            if (p.getName().equalsIgnoreCase(name)) {
                p.setFitness(b);
                System.out.println("Fitness is update");

            }

        }
    }

     void updateFitness(ArrayList<players> plist, String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PLayers finess:");
        int b = sc.nextInt();
        for (players p : plist) {
            if (p.getName().equalsIgnoreCase(name)) {
                p.setFitness(b);
                System.out.println("Fitness is update");

            }

        }
    }

    void informadmin(ArrayList<players> plist) {
        int c = 0;
        for (players p : plist) {
            if (p.getFitness() < 7) {
                System.out.println(p.getName() + " are injured");
                c = c + 1;
            }

        }
        if (c == 0) {
            System.out.println("No player are injured");
        }
    }
}
