package cantinaffi;
import java.util.Locale;import java.util.Scanner;
public class BonDetaliatC2 {public static void main(String[] args){
 Locale.setDefault(Locale.US);Scanner sc=new Scanner(System.in);String[] n={"Zeamă de casă","Piure cu pârjoală","Salată de varză","Compot"};double[] p={24.50,46,18,12};int[] q=new int[4];
 while(true){System.out.println("\\n=== MENIU ===");for(int i=0;i<4;i++)System.out.printf("%d. %-22s %6.2f lei%n",i+1,n[i],p[i]);System.out.println("0. Finalizare");System.out.print("Alege produsul: ");int a=sc.nextInt();if(a==0)break;if(a<1||a>4){System.out.println("Opțiune invalidă.");continue;}System.out.print("Numărul de porții: ");int nr=sc.nextInt();if(nr<1){System.out.println("Număr invalid.");continue;}q[a-1]+=nr;}
 double sub=0;System.out.println("=== BON DETALIAT ===");for(int i=0;i<4;i++)if(q[i]>0){double x=q[i]*p[i];sub+=x;System.out.printf("%s x %d = %.2f lei%n",n[i],q[i],x);}
 double r=sub>100?sub*.15:0;System.out.printf("Subtotal: %.2f lei%nReducere: %.2f lei%nTotal: %.2f lei%n",sub,r,sub-r);
}}