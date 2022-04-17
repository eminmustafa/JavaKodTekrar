package ElifHoca.Basic_02;

import java.util.Scanner;

public class E07_StringManipulation {

    // Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak bilestiriniz
    // yukaridaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.print("String 1 : ");
        String str1= scan.nextLine();
        System.out.print("String 2 : ");
        String str2= scan.nextLine();


        System.out.println("Striglerin method ile birlesimi : " + str1.concat(" "+str2));

        String str1ilksiz = str1.substring(1);
        String str2ilksiz = str2.substring(1);

        System.out.println("Stringlerin ilk harfsiz halleri : " + str1ilksiz + " " + str2ilksiz);


    }
}
