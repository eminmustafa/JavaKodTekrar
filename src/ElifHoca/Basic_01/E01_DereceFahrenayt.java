package ElifHoca.Basic_01;

import java.util.Scanner;

public class E01_DereceFahrenayt {
    /*
   gallonu litreye ceviren bir java programi yaziniz
       1 gallon = 3.785 litre
   litreyi gallona ceviren bir java programi yaziniz
       1 litre = 1/3.785 gallon
    */
    public static void main(String[] args) {

        int gallon=1;
        double litre=1;

        System.out.println(gallon + " gallon = " + gallon*3.785 + " litredir");
        System.out.println(litre + " litre = " + litre/3.785 + "  gallondur");
        /*
         Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
          formül ===> c = (f-32)*5/9
         */
        double fahrenayt=70;
        System.out.println(fahrenayt + " fahrenayt = " + (fahrenayt-32)*5/9 + " derecedir");

        // kullanicidan al deseydi
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen  fehrenayt cinsinden sicaklik giriniz");
        int fht=scan.nextInt();

        double derece = (fht-32)*5/9;
        System.out.println(fht + " fahrenayt = " + derece + " derecedir");







    }
}
