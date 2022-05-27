import java.util.Scanner;

public class taskvucutkitleindex {
    public static void main(String[] args) {
        double boy, kilo, kitleindex;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuz(virgul kullanarak yaziniz) : ");
        boy = input.nextDouble();

        System.out.print("Kilonuz : ");
        kilo = input.nextDouble();

        //kilo / (boy*boy)
        kitleindex = kilo / (boy*boy);
        System.out.println("Vucut Kitle Indexiniz : " + kitleindex);




    }
}
