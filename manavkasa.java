import java.util.Scanner;


public class manavkasa {
    public static void main(String[] args) {

        double total, armut, elma, domates, muz, patlican;

        Scanner input = new Scanner(System.in);

        System.out.print("Kac KG Armut Aldiniz? : ");
        armut = input.nextDouble();

        System.out.print("Kac KG Elma Aldiniz? : ");
        elma = input.nextDouble();

        System.out.print("Kac KG Domates Aldiniz? : ");
        domates = input.nextDouble();

        System.out.print("Kac KG Muz Aldiniz? : ");
        muz = input.nextDouble();

        System.out.print("Kac KG Patlican Aldiniz? : ");
        patlican = input.nextDouble();

        total = (armut * 21.0) + (elma * 8.50) + (domates * 19.0) + (muz * 36.90) + (patlican * 13.90);
        System.out.println("Toplam Tutar : " + total) ;
        System.out.println("EKONOMI COK IYI YEGENIM :)))))");



































    }

}
