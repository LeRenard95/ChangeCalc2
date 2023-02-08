import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner price = new Scanner(System.in);
        System.out.println("What is the price of the good?");
        double price2 = price.nextDouble();
        BigDecimal price2R = BigDecimal.valueOf(price2);


        Scanner money = new Scanner(System.in);
        System.out.println("How much money was given?");
        double money2 = money.nextDouble();
        BigDecimal money2R = BigDecimal.valueOf(money2);

        BigDecimal changeR = money2R.subtract(price2R);
        System.out.println("Change: " + changeR);

       double changeRR = changeR.doubleValue();

       double fiftyc = changeRR/0.5;
       double twentyc = (changeRR - fiftyc*0.5)/0.2;
       double fivec = changeRR - (fiftyc*0.5 + twentyc*0.2);

       System.out.println("Fifity cents: " + fiftyc + "Twenty cents: " + twentyc + "Five cents: " + fivec);
    }
}