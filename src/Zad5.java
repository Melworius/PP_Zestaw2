/* Napisa� program, kt�ry pobiera od u�ytkownika ci�g liczb ca�kowitych. Pobieranie
 * danych ko�czone jest podaniem warto�ci 0 (nie jest brana pod uwag� w
 * obliczeniach). W nast�pnej kolejno�ci program powinien wy�wietli�:
 * � najmniejsz� i najwi�ksz� podan� warto��,
 * � sum� podanych liczb,
 * � �redni� arytmetyczn� podanych liczb.
 * Przyk�ad:
 * U�ytkownik poda� ci�g: 1, -4, 2, 17, 0.
 * Wynik programu:
 * min: -4
 * max: 17
 * suma: 16
 * �rednia: 4
 */
import java.util.Scanner;
public class Zad5 {

	public static void main(String[] args) {
	
		int a;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		double mid;
		int suma = 0;
		Scanner liczba = new Scanner(System.in);
		
		do {
			System.out.print("0 ko�czy dzia�anie programu. Podaj liczb� ca�kowit�: ");
			a = liczba.nextInt();
			if (a<min && a!=0) min = a;
			if (a>max && a!=0) max = a;
			mid = (min+max)/2;
			suma += a;
			} 
		 while (a != 0);
		System.out.println("Warto�� minimalna to: " + min);
		System.out.println("Warto�� maksymalna to: " + max);
		System.out.println("Suma to: " + suma);
		System.out.println("�rednia arytmetyczna to: " + mid);
	
		liczba.close();
	}

}
