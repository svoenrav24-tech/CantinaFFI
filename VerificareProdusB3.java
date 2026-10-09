package cantinaffi;
import java.util.Scanner;
public class VerificareProdusB3 {public static void main(String[] args){
 Scanner sc=new Scanner(System.in);Produs[] ps={new Produs("Zeamă de casă",24.50,30),new Produs("Piure cu pârjoală",46,25),new Produs("Salată de varză",18,20),new Produs("Compot",12,40)};
 System.out.print("Denumirea produsului: ");String s=sc.nextLine();Produs gasit=null;for(Produs p:ps)if(p.getDenumire().equals(s)){gasit=p;break;}
 if(gasit==null){System.out.println("Produsul solicitat nu există în meniu.");return;}System.out.print("Numărul de porții: ");int q=sc.nextInt();
 if(gasit.esteDisponibil(q)){System.out.printf("Costul comenzii: %.2f lei%n",gasit.costPentru(q));System.out.println("Produs disponibil.");}else System.out.println("Stoc insuficient sau număr de porții invalid.");
}}