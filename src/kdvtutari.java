import java.util.Scanner;


public class kdvtutari {
    public static void main(String[] args) {
        /*KDV Tutarı Hesaplayan Program
        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        (Not : KDV tutarını 18% olarak alın)
        KDV'siz Fiyat = 10;
        KDV'li Fiyat = 11.8;
        KDV tutarı = 1.8;*/

        double urunfiyati;

        Scanner input = new Scanner(System.in);

        System.out.print("Urun fiyatini yaziniz : ");
        urunfiyati = input.nextDouble();
        System.out.println("Urunun kdv'siz fiyati : " + urunfiyati);
        System.out.println("KDV Orani : 0.18");

        double kdv = urunfiyati * 18/100;
        System.out.println("KDV Tutari : " + kdv);

        double kdveklenmisfiyat = (urunfiyati) + (urunfiyati * 18/100);
        System.out.println("KDV Eklenmis Tutar : " + kdveklenmisfiyat);





    }

}
