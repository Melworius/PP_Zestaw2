/* Napisaæ program, który pobiera od u¿ytkownika ci¹g liczb ca³kowitych. Pobieranie
 * danych koñczone jest podaniem wartoœci 0 (nie jest brana pod uwagê w
 * obliczeniach). W nastêpnej kolejnoœci program powinien wyœwietliæ:
 * • najmniejsz¹ i najwiêksz¹ podan¹ wartoœæ,
 * • sumê podanych liczb,
 * • œredni¹ arytmetyczn¹ podanych liczb.
 * Przyk³ad:
 * U¿ytkownik poda³ ci¹g: 1, -4, 2, 17, 0.
 * Wynik programu:
 * min: -4
 * max: 17
 * suma: 16
 * œrednia: 4
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
			System.out.print("0 koñczy dzia³anie programu. Podaj liczbê ca³kowit¹: ");
			a = liczba.nextInt();
			if (a<min && a!=0) min = a;
			if (a>max && a!=0) max = a;
			mid = (min+max)/2;
			suma += a;
			} 
		 while (a != 0);
		System.out.println("Wartoœæ minimalna to: " + min);
		System.out.println("Wartoœæ maksymalna to: " + max);
		System.out.println("Suma to: " + suma);
		System.out.println("Œrednia arytmetyczna to: " + mid);
	
		liczba.close();
	}

}
