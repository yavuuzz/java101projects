import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        /*Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir. */

    double km, perKM = 2.20, totalPrice, startPrice = 10;

    Scanner input = new Scanner(System.in);
    System.out.print("Gidilen KM degeriniz yaziniz : ");
    km = input.nextDouble();


    totalPrice = (km*perKM) + startPrice;
    totalPrice = (totalPrice < 20) ? 20 : totalPrice;

    System.out.println("Odenecek Tutar : " + totalPrice);










    }
}
