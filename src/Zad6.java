/*  Gra w �Za du�o, za ma�o�. Komputer losuje liczb� z zakresu 1 . . . 100, a gracz
 * (u�ytkownik) ma za zadanie odgadn��, co to za liczba poprzez podawanie kolejnych
 * warto�ci. Je�eli podana warto�� jest:
 * � wi�ksza � wy�wietlany jest komunikat �Poda�e� za du�� warto��,
 * � mniejsza � wy�wietlany jest komunikat �Poda�e� za ma�� warto��,
 * � identyczna z wylosowan� � wy�wietlany jest komunikat �Gratulacje� i gra si� ko�czy. 
 */
import java.util.Random;
import java.util.Scanner;
public class Zad6 {
	public static void main(String[] args) {
		int a;
		Scanner liczba = new Scanner(System.in);
		
		do {
			System.out.println("Podaj liczb�: ");
			a = liczba.nextInt();
			if ()
		}
		while (a>=1 && a<=100);
		liczba.close();
	}

}
