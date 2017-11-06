/*Napisaæ program, który pobiera od u¿ytkownika liczbê ca³kowit¹ dodatni¹, a nastêpnie
 * wyœwietla na ekranie kolejno wszystkie liczby niepatrzyste nie wiêksze od
 * podanej liczby. Przyk³ad, dla 15 program powinien wyœwietliæ 1, 3, 5, 7, 9, 11, 13, 15.
*/
import java.util.Scanner;

public class Zad1
{
	public static void main (String[] args)
	{
		System.out.println("Proszê podaæ liczbê: ");
		int a;
		
		Scanner liczba = new Scanner(System.in);
		
		a = liczba.nextInt();
			
		for(int i = 1; i<=a; i=i+2)
		{ 
		System.out.println(i);	
			liczba.close();
		
		
		}
			
	}
	
}
