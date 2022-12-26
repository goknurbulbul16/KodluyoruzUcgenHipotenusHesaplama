import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int aKenar, bKenar, cKenar;
        double u ,alan ;


        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı Uzunluğunu Giriniz: ");
        aKenar = input.nextInt();

        System.out.print("2. Kenarı Uzunluğunu Giriniz: ");
        bKenar = input.nextInt();

        System.out.print("3. Kenarı Uzunluğunu Giriniz: ");
        cKenar = input.nextInt();

        u = (aKenar+bKenar+cKenar)/2;
        System.out.println("Üçgenin Çevresi: " + 2*u);

        alan = Math.sqrt( ( u * (u-aKenar) * (u-bKenar) * (u-cKenar) ) );
        System.out.println("Üçgenin Alanı: " + alan);

    }
}