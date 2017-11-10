/* Napisaæ program pobieraj¹cy od u¿ytkownika dwie liczby ca³kowite A oraz B,
 * A < B, a nastêpnie wyznaczaj¹cy sumê ci¹gu liczb od A do B, czyli sumê ci¹gu
 * (A, A + 1, . . . , B). Obliczenia nale¿y wykonaæ trzykrotnie stosuj¹c kolejno pêtle:
 * while, do-while, for.
*/

import java.util.Scanner;
public class Zad2 {
    public static void main (String[] args){
 
    	int A;
    	int B;
    	int wynik;
    	
        Scanner liczba = new Scanner(System.in);
        System.out.println("Warunek poprawnego dzia³ania programu A<B");
        System.out.println("Podaj liczbê A");
        A = liczba.nextInt();
        System.out.println("Podaj liczbê B");
        B = liczba.nextInt();
        
        wynik = B;
 
        while (A<B) {
            wynik += A;
            A ++;
        }
             System.out.println("Suma ci¹gu = " + wynik);
            wynik = wynik - A;    
 
         do {
            wynik += A;
            A ++;
        } while (A<B);
 
            System.out.println("Suma ci¹gu = " + wynik);
 
         for (;A<B;A++) {
            wynik += A;
        }
            System.out.println("Suma ci¹gu = " + wynik);
            liczba.close();
    }
 
}
