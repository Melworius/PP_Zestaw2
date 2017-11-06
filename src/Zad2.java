/* Napisaæ program pobieraj¹cy od u¿ytkownika dwie liczby ca³kowite A oraz B,
 * A < B, a nastêpnie wyznaczaj¹cy sumê ci¹gu liczb od A do B, czyli sumê ci¹gu
 * (A, A + 1, . . . , B). Obliczenia nale¿y wykonaæ trzykrotnie stosuj¹c kolejno pêtle:
 * while, do-while, for.
*/

import java.util.Scanner;

public class Zad2 {

	public static void main (String[] args) 
	{
		System.out.println("Podaj dwie liczby ca³kowite, gdzie a<b: ");
		int a;
		int b;
		
		Scanner liczba = new Scanner(System.in);
		
		a = liczba.nextInt();
		b = liczba.nextInt();
		
		while(true) {
			
			System.out.println((b+a)*(b-a+1)/2);
			break;
			}
			
		liczba.close();
	}
}
