package ElifHoca.Basic_02;

import java.util.Scanner;

public class E01_NestedIfOyKullanma {
    /*
      vote:oy, voting age:oy kullanma yasi

      Kullanici dan yas bilgisini alarak
   oy kullanma yasi :
   age >= 18  ==> oy kullanmaya uygun
   age >= 70  ==> uc kez oy kullanabilir
   70 > age >=50 ==> iki kez oy kullanabilir
   50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz
*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz : ");
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("yasiniz oy kullanmaya uygundur");
            if (age >= 70) {
                System.out.println("uc kez oy kullanabilir");
            } else if (age >= 50) {
                System.out.println("iki kez oy kullanabilir");
            }else {
                System.out.println("bir kez oy kullanabilir");
            }
        }else if (age>0 && age >18){
            System.out.println("yasiniz oy kullnamaya uygun degildir");

        }else
            System.out.println("yanlis giris yaptiniz :(...");
    }
}