package cantinaffi;
import java.util.Scanner;
public class RestBancnoteC1 {public static void main(String[] args){
 Scanner sc=new Scanner(System.in);System.out.print("Suma de plată: ");int plata=sc.nextInt();System.out.print("Suma achitată: ");int achitat=sc.nextInt();int r=achitat-plata;
 System.out.println("Rest: "+r+" lei");
 System.out.println("500 lei: "+(r/500));System.out.println("200 lei: "+((r%500)/200));System.out.println("100 lei: "+((r%500%200)/100));
 System.out.println("50 lei: "+((r%100)/50));System.out.println("20 lei: "+((r%50)/20));System.out.println("10 lei: "+((r%20)/10));System.out.println("5 lei: "+((r%10)/5));System.out.println("1 leu: "+(r%5));
}}