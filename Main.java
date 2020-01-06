import java.util.*;

public class Main{
	public static void main(String[] args){
		int lengthOfPermutations = 0;
		try {
			lengthOfPermutations = Integer.parseInt(args[1]);
		} catch(NumberFormatException e) {
			System.out.println("BLAD:");
			System.out.println("Drugi argument programu nie jest liczbą");
		}
		
		Permutate permutate = new Permutate(lengthOfPermutations);
		try {
		permutate.permutate(args[0] , "");
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("BLAD: ");
			System.out.println("Podana wartosc w drugim argumencie jest niepoprawna lub pierwszy argument jest pusty");
		}
		permutate.printSet();
	}
}
