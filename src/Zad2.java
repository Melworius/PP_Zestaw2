/* Napisa� program pobieraj�cy od u�ytkownika dwie liczby ca�kowite A oraz B,
 * A < B, a nast�pnie wyznaczaj�cy sum� ci�gu liczb od A do B, czyli sum� ci�gu
 * (A, A + 1, . . . , B). Obliczenia nale�y wykona� trzykrotnie stosuj�c kolejno p�tle:
 * while, do-while, for.
*/

import java.util.Scanner;
public class Zad2 {
    public static void main (String[] args){
 
    	int A;
    	int B;
    	int wynik;
    	
        Scanner liczba = new Scanner(System.in);
        System.out.println("Warunek poprawnego dzia�ania programu A<B");
        System.out.println("Podaj liczb� A");
        A = liczba.nextInt();
        System.out.println("Podaj liczb� B");
        B = liczba.nextInt();
        
        wynik = B;
 
        while (A<B) {
            wynik += A;
            A ++;
        }
             System.out.println("Suma ci�gu = " + wynik);
            wynik = wynik - A;    
 
         do {
            wynik += A;
            A ++;
        } while (A<B);
 
            System.out.println("Suma ci�gu = " + wynik);
 
         for (;A<B;A++) {
            wynik += A;
        }
            System.out.println("Suma ci�gu = " + wynik);
            liczba.close();
    }
 
}
