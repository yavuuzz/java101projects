package Main.main;

import java.util.Scanner;

public class notOrt {
    public static void main(String[] args) {
        int mat, fizik, kimya, muzik, tarih;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik = input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();

        int notlarinToplami = (mat + fizik + kimya + muzik + tarih);
        double notlarinToplamiBoluDersSayisi = notlarinToplami / 5.0;
        System.out.println("Ortalamaniz : " + notlarinToplamiBoluDersSayisi);

        boolean sonuc = notlarinToplamiBoluDersSayisi >= 60.0;
        String str = sonuc ? "Sinifi gecmeye hak kazandiniz" : "Sinifi gecemediniz";
        System.out.println(str);

    }
}