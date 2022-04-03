package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> products = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();
        ArrayList<String> purchases = new ArrayList<String>();
        products.add("Bison Sweater");
        prices.add(55.99);
        products.add("Bison Tee");
        prices.add(14.99);
        products.add("Bison Hoodie");
        prices.add(23.99);
        products.add("Bison Bumpersticker");
        prices.add(4.99);
        double total = 0.0;
        int j = 0;

        String answer = "";
        do {
            System.out.println("What do you want to do?");
            System.out.println("1) add purchase 2) change purchase 3) show purchases 4) finish transaction");
            answer = input.nextLine();
            if (answer.equals("1")) {
                System.out.println("What do you wish to buy?");
                answer = input.nextLine();
                purchases.add(answer);
                total += prices.get(purchases.indexOf(answer));
            }
            if (answer.equals("2")) {
                System.out.println("What do you want to change?");
                answer = input.nextLine();
                System.out.println("What do you want to change it to?");
                answer = input.nextLine();
                int index = products.indexOf(answer);
                 purchases.set(index,answer);



            }
            if (answer.equals("3")) {
                for (int w = 0; w < purchases.size(); w++) {
                    System.out.println(purchases.get(w));
                }
            }
        } while (!answer.equals("4"));
        if (answer.equals("4")) {
            System.out.println("Your total is: " + total);
        }
    }
}
