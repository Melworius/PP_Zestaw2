/* Napisa� program pobieraj�cy od u�ytkownika dwie liczby ca�kowite A oraz B,
 * A < B, a nast�pnie wyznaczaj�cy sum� ci�gu liczb od A do B, czyli sum� ci�gu
 * (A, A + 1, . . . , B). Obliczenia nale�y wykona� trzykrotnie stosuj�c kolejno p�tle:
 * while, do-while, for.
*/

import java.util.Scanner;

public class Zad2 {

	public static void main (String[] args) 
	{
		System.out.println("Podaj dwie liczby ca�kowite, gdzie a<b: ");
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
