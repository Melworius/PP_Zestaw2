/*  Gra w „Za du¿o, za ma³o”. Komputer losuje liczbê z zakresu 1 . . . 100, a gracz
 * (u¿ytkownik) ma za zadanie odgadn¹æ, co to za liczba poprzez podawanie kolejnych
 * wartoœci. Je¿eli podana wartoœæ jest:
 * • wiêksza – wyœwietlany jest komunikat „Poda³eœ za du¿¹ wartoœæ”,
 * • mniejsza – wyœwietlany jest komunikat „Poda³eœ za ma³¹ wartoœæ”,
 * • identyczna z wylosowan¹ – wyœwietlany jest komunikat „Gratulacje” i gra siê koñczy. 
 */
import java.util.Random;
import java.util.Scanner;
public class Zad6 {
	public static void main(String[] args) {
		int a;
		Scanner liczba = new Scanner(System.in);
		
		do {
			System.out.println("Podaj liczbê: ");
			a = liczba.nextInt();
			if ()
		}
		while (a>=1 && a<=100);
		liczba.close();
	}

}
