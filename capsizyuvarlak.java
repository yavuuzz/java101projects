import java.util.Scanner;

public class capsizyuvarlak {
    public static void main(String[] args) {
        double r, pi = 3.14, a, area;
        Scanner input = new Scanner(System.in);

        System.out.print("Yaricap Uzunlugunu Giriniz : ");
        r = input.nextDouble();

        System.out.print("Merkez Aci Olcusunu Giriniz : ");
        a = input.nextDouble();


        area = (pi * (r*r) * a) / 360;
        System.out.println("Alan : " + area);







    }
}
