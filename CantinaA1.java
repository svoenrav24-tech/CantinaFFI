package cantinaffi;
import java.util.Locale; import java.util.Scanner;
public class CantinaA1 { public static void main(String[] args){
 Locale.setDefault(Locale.US); Scanner sc=new Scanner(System.in);
 String[] n={"Zeamă de casă","Piure cu pârjoală","Salată de varză","Compot"}; double[] p={24.50,46,18,12};
 System.out.println("=== MENIUL ZILEI ==="); for(int i=0;i<n.length;i++) System.out.printf("%d. %-22s %6.2f lei%n",i+1,n[i],p[i]);
 System.out.print("Alege produsul (1-4): "); int a=sc.nextInt(); if(a<1||a>4){System.out.println("Produs invalid.");return;}
 System.out.print("Numărul de porții: "); int q=sc.nextInt(); if(q<0){System.out.println("Numărul de porții nu poate fi negativ.");return;}
 System.out.printf("Cost total: %.2f lei%n",p[a-1]*q);
}}