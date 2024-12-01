import java.util.Scanner;
public class KDV_Hesaplama {
public static void main(String[] args) {
    double tutar = 0, kdv_oran = 0.18 ;
    
    System.out.println("Tutar giriniz:");
    
    Scanner inp = new Scanner(System.in);
    
    tutar = inp.nextDouble();
    double toplam_tutar = (tutar * kdv_oran) + tutar;
    System.out.println("KDV tutarı :" + tutar * kdv_oran);

    System.out.println("KDvli Tutar = " + toplam_tutar);

}
}
