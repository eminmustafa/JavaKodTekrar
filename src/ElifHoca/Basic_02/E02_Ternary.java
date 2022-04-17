package ElifHoca.Basic_02;

public class E02_Ternary {
     /*
     Final notu tanimlayin, Nested Ternary ile cozunuz
     'A'  ->  "Gayet Basarili"
     'B'  ->  "Basarili"
     'C'  ->   "Ha gayret"
      bu notlar disindakilere de Digerleri.. yazdiriniz
 */

     public static void main(String[] args) {

         char finalNotu = '*';

         String sonuc ="";

         sonuc =(finalNotu=='A')? "Gayet Basarili" :
                (finalNotu=='B')? "Basarili" :
                (finalNotu=='C')? "Ha gayret" :"Digerleri..";

         System.out.println("sonuc : "+ sonuc) ;

     }
     }



