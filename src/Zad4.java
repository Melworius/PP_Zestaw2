/* Napisaæ program, który wczytuje liczby podawane przez u¿ytkownika dot¹d, 
 * dopóki nie podana zostanie liczba 0. 
 * Nastêpnie wyœwietliæ sumê wszystkich podanych liczb. 
 */
import java.util.Scanner;
public class Zad4 {

	public static void main(String[] args) {
		System.out.println("Podaj liczbê: ");
		int p;
		int suma;
		Scanner liczba = new Scanner(System.in);
		p = liczba.nextInt();
		do {
			//System.out.println("Podaj liczbê: ");
			 
			if (p != 0) {
				System.out.println("Podaj liczbê: ");
				p = liczba.nextInt();
			} else {
				suma = p;
				System.out.println(suma);
			}	
			}
			while (p != 0);
			
			liczba.close();
		}
	}


