import java.util.Scanner;

public class Not_Ortalamasi {
public static void main(String[] args) {
   int Mat, Fiz, Kimya, Turkce, Tarih, Muzik;

   System.out.println("Matematik notunu giriniz");
   Scanner inp = new Scanner(System.in);

   Mat = inp.nextInt();
   
   System.out.println("Fizik notunu giriniz");
   

   Fiz = inp.nextInt();
   
   System.out.println("Kimya notunu giriniz");
   

   Kimya = inp.nextInt();
   
   System.out.println("Turkce notunu giriniz");
   

   Turkce = inp.nextInt();
   
   System.out.println("Tarih notunu giriniz");
   

   Tarih = inp.nextInt();
   
   System.out.println("Muzik notunu giriniz");
   

   Muzik = inp.nextInt();
   
   int toplam = (Mat+Fiz+Kimya+Turkce+Tarih);

   Double ortalama = toplam / 6.0 ;
   
   System.out.println("Sonuc 30 "+ ortalama);
   
}
}
