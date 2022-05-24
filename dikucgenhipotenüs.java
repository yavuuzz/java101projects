import java.util.Scanner;

public class dikucgenhipotenüs {
    public static void main(String[] args) {
        double uzun,kisa;
        Scanner input = new Scanner(System.in);

        System.out.print("Uzun Kenar Uzunlugunu Giriniz : ");
        uzun = input.nextDouble();

        System.out.print("Kisa Kenar Uzunlugunu Giriniz : ");
        kisa = input.nextDouble();


        //Math.sqrt() : karekök alır
        double hipotenus  = Math.sqrt((uzun*uzun) + (kisa*kisa));
        System.out.println("Hipotenus : " + hipotenus);

        //uzunluk = u
        double u = (uzun + kisa + hipotenus) / 2;
        double alan = Math.sqrt(u * (u - uzun) * (u - kisa) * (u - hipotenus));
        System.out.println("Alan : " + alan);




    }
}
