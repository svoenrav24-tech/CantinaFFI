package cantinaffi;
import java.util.Locale;import java.util.Scanner;
public class MeniuInteractvB2 {public static void main(String[] args){
 Locale.setDefault(Locale.US);Scanner sc=new Scanner(System.in);String[] n={"Zeamă de casă","Piure cu pârjoală","Salată de varză","Compot"};double[] p={24.50,46,18,12};double total=0;
 while(true){System.out.println("\\n=== MENIU ===");for(int i=0;i<4;i++)System.out.printf("%d. %-22s %6.2f lei%n",i+1,n[i],p[i]);System.out.println("0. Finalizare comandă");System.out.print("Alege produsul: ");int a=sc.nextInt();if(a==0)break;if(a<1||a>4){System.out.println("Opțiune invalidă.");continue;}System.out.print("Numărul de porții: ");int q=sc.nextInt();if(q<1){System.out.println("Introdu cel puțin o porție.");continue;}total+=p[a-1]*q;System.out.printf("Total curent: %.2f lei%n",total);}
 double r=total>100?total*.15:0;System.out.printf("Total acumulat: %.2f lei%nReducere: %.2f lei%nSuma de plată: %.2f lei%n",total,r,total-r);
}}