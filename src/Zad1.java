/*Napisa� program, kt�ry pobiera od u�ytkownika liczb� ca�kowit� dodatni�, a nast�pnie
 * wy�wietla na ekranie kolejno wszystkie liczby niepatrzyste nie wi�ksze od
 * podanej liczby. Przyk�ad, dla 15 program powinien wy�wietli� 1, 3, 5, 7, 9, 11, 13, 15.
*/
import java.util.Scanner;

public class Zad1
{
	public static void main (String[] args)
	{
		System.out.println("Prosz� poda� liczb�: ");
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
