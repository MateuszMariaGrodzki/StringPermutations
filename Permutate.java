import java.util.*;
public class Permutate{
	private Set<String> permutations;
	private int length;
	
	public Permutate(int length){
		this.length = length;
		permutations = new HashSet<>();
	}

	public void permutate(String given , String toPrint){

		if(given.length() == 0){
			permutations.add(toPrint.substring(0,length));
		}
		
		for(int i = 0 ; i < given.length() ; ++i){
		char currentChar = given.charAt(i);
		String rest = given.substring(0 , i) +
			given.substring(i + 1);

		permutate(rest , toPrint + currentChar);
		}
	}
	
	public void printSet(){

		Iterator value = permutations.iterator();

		while(value.hasNext()){
			
			for(int i = 1 ; i < length ; ++i){
			System.out.print("|" + value.next());
			}
			System.out.print("|" + value.next()+ "|");
			System.out.println("");
		}
	}
}
