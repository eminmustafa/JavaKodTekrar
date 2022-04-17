package ElifHoca.Basic_01;

import java.util.Scanner;

public class E02_DogruYanlis {
    /*
     * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen  Y veya N giriniz");
        char harf=scan.next().charAt(0);

        if (harf == 'Y' || harf == 'y'){
            System.out.println("YES");
        }else  if (harf == 'N' || harf == 'n'){
            System.out.println("NO");
        }else{
            System.out.println("!*Yanlis harf giridiniz lutfen tekrar deneyiniz*!");
        }


    }
}
