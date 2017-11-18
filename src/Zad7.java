/* Napisa� program dzia�aj�cy w trybie konsolowym (tekstowym) i rysuj�cy na ekranie
 * prostok�t. U�ytkownik podaje znak wype�nienia prostok�ta, pozycj� lewego
 * g�rnego rogu prostok�ta (x, y) oraz d�ugo�ci bok�w prostok�ta (ab). Przyjmujemy,
 * �e lewy g�rny naro�nik konsoli ma wsp�rz�dne (x, y) = (1, 1).
 * Przyk�ad: x=6, y=3, a=4, b=6, zn=�x�
 * >
 * >
 * > _____xxxxxx
 * > _____xxxxxx
 * > _____xxxxxx
 * > _____xxxxxx
 * ozn.
 * > - nowa linia,
 * _ - znak spacji.
 */
import java.util.Scanner;
public class Zad7 {
	public static void main (String[] args) {
		int x, y, a, b, i, j;
		char zn;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Prosze poda� pozycje [x,y] prostok�ta oddzielaj�c je spacjami: ");
		x = scan.nextInt();
		y = scan.nextInt();
		System.out.print("Prosze poda� wymiary [a,b] prostok�ta oddzielaj�c je spacjami: ");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.print("Prosze poda� znak, z kt�rego ma powsta� prostok�t: ");
		zn = scan.next().charAt(0);
		
		for(i=0; i<y; i++) {
			System.out.print(">\n");
			}
		for(j=0; j<a; j++) {
			System.out.print(">");
			for(i=0; i<x; i++) {
				System.out.print("_");
				}
			for(i=0; i<b; i++) {
				System.out.print(zn);
			}
			System.out.println();
			scan.close();
		}
	}
}
