import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int a, basSay = 0, basamak = 0, toplam = 0, d, s;

        out.print("Armstrong'u bulunacak sayıyı giriniz : ");
        a = input.nextInt();
        d = a;
        s = a;
        //basamak sayısını buluyoruz.Farklı bir değişkene atıyoruz ki a silinmesin.
        while (d != 0) {
            d /= 10;
            basSay++;
        }
        for (int i = 0; i < basSay; i++) {
            int b = 1;
            int v = 1;
            b = a % 10;
            for (int c = 0; c < basSay;c++ ) {
                v = v * b;
            }
            toplam = toplam + v;
            a /= 10;
        }
        if (s == toplam) out.print(s + " Bir Armstrong sayıdır.");
        else out.print(s + " Bir Armstrong sayı değildır.");


    }
}
