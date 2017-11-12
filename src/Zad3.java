/*Napisaæ program, który wczytuje od u¿ytkownika liczbê ca³kowit¹ dodatni¹ n, 
 * a nastêpnie wyœwietla na ekranie wszystkie potêgi liczby 2 nie wiêksze, 
 * ni¿ podana liczba. Przyk³adowo, dla iczby 71 program powinien wyœwietliæ:
 * 1
 * 2
 * 4
 * 8
 * 16
 * 32
 * 64 
 */
import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
	
		System.out.println("Podaj liczbê ca³kowit¹: ");
		int n;
		int wynik = 1;
		Scanner liczba = new Scanner(System.in);
		n = liczba.nextInt();
		
		while(wynik<n) {
		System.out.println(wynik);
		wynik*=2;
		}
		
		liczba.close();
		}
}
