/* Napisa� program, kt�ry wczytuje liczby podawane przez u�ytkownika dot�d, 
 * dop�ki nie podana zostanie liczba 0. 
 * Nast�pnie wy�wietli� sum� wszystkich podanych liczb. 
 */
import java.util.Scanner;
public class Zad4 {

	public static void main(String[] args) {
		System.out.println("Podaj liczb�: ");
		int p;
		int suma;
		Scanner liczba = new Scanner(System.in);
		p = liczba.nextInt();
		do {
			//System.out.println("Podaj liczb�: ");
			 
			if (p != 0) {
				System.out.println("Podaj liczb�: ");
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


