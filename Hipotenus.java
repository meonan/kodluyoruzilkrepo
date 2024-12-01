import java.util.Scanner;;
public class Hipotenus {
public static void main(String[] args) {
    double a, b, c;

    System.out.println("Lutfen dik kenarların degerlerini giriniz: ");

    Scanner inp=  new Scanner(System.in);

    a = inp.nextDouble();

    b = inp.nextDouble();

    System.out.println("Hipotenus kenarı= "+ Math.sqrt((a*a)+(b*b)));


}
}
