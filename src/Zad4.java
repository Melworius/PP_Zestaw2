/* Napisa� program, kt�ry wczytuje liczby podawane przez u�ytkownika dot�d, 
 * dop�ki nie podana zostanie liczba 0. 
 * Nast�pnie wy�wietli� sum� wszystkich podanych liczb. 
 */
import java.util.Scanner;
public class Zad4 {

    public static void main(String[] args) {
        int p;
        int suma = 0;
        Scanner liczba = new Scanner(System.in);

        do {
            System.out.print("Podaj liczbe: ");
            p = liczba.nextInt();
            suma += p;
        } while (p != 0);

        System.out.println("Suma to: " + suma);
        liczba.close();
		}
	}


