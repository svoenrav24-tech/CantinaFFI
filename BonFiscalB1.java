package cantinaffi;
import java.util.Locale;import java.util.Scanner;
public class BonFiscalB1 {public static void main(String[] args){
 Locale.setDefault(Locale.US);Scanner sc=new Scanner(System.in);double[] p={24.50,46,18,12};
 System.out.println("1. Zeamă de casă - 24.50 lei\n2. Piure cu pârjoală - 46.00 lei\n3. Salată de varză - 18.00 lei\n4. Compot - 12.00 lei");
 System.out.print("Alege produsul (1-4): ");int a=sc.nextInt();if(a<1||a>4){System.out.println("Produs invalid.");return;}
 System.out.print("Numărul de porții: ");int q=sc.nextInt();if(q<0){System.out.println("Număr invalid.");return;}
 System.out.print("Student bursier? (true/false): ");boolean b=sc.nextBoolean();
 double sub=p[a-1]*q,red=b?sub*.15:0,baza=sub-red,tva=baza*.20,total=baza+tva;
 System.out.println("=== BON FISCAL ===");System.out.printf("Subtotal: %.2f lei%nReducere: %.2f lei%nTVA (20%%): %.2f lei%nTotal: %.2f lei%n",sub,red,tva,total);
}}