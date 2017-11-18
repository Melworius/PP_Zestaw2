/* Napisaæ program dzia³aj¹cy w trybie konsolowym (tekstowym) i rysuj¹cy na ekranie
 * prostok¹t. U¿ytkownik podaje znak wype³nienia prostok¹ta, pozycjê lewego
 * górnego rogu prostok¹ta (x, y) oraz d³ugoœci boków prostok¹ta (ab). Przyjmujemy,
 * ¿e lewy górny naro¿nik konsoli ma wspó³rzêdne (x, y) = (1, 1).
 * Przyk³ad: x=6, y=3, a=4, b=6, zn=’x’
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
		
		System.out.print("Prosze podaæ pozycje [x,y] prostok¹ta oddzielaj¹c je spacjami: ");
		x = scan.nextInt();
		y = scan.nextInt();
		System.out.print("Prosze podaæ wymiary [a,b] prostok¹ta oddzielaj¹c je spacjami: ");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.print("Prosze podaæ znak, z którego ma powstaæ prostok¹t: ");
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
