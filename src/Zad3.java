/*Napisa� program, kt�ry wczytuje od u�ytkownika liczb� ca�kowit� dodatni� n, 
 * a nast�pnie wy�wietla na ekranie wszystkie pot�gi liczby 2 nie wi�ksze, 
 * ni� podana liczba. Przyk�adowo, dla iczby 71 program powinien wy�wietli�:
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
	
		System.out.println("Podaj liczb� ca�kowit�: ");
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
