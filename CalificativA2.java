package cantinaffi;
import java.util.Scanner;
public class CalificativA2 { public static void main(String[] args){
 Scanner sc=new Scanner(System.in); System.out.print("Introdu nota (0-10): ");
 if(!sc.hasNextInt()){System.out.println("notă invalidă");return;} int n=sc.nextInt();
 if(n<0||n>10) System.out.println("notă invalidă");
 else if(n<5) System.out.println("nesatisfăcător"); else if(n<=6) System.out.println("satisfăcător");
 else if(n<=8) System.out.println("bine"); else System.out.println("excelent");
}}