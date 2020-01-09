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
		int lineNumber = 1;
		Iterator value = permutations.iterator();

		while(value.hasNext()){
			System.out.print(lineNumber + ")");
			for(int i = 1 ; i < length ; ++i){
			
			System.out.print("|" + value.next());
			}
			System.out.print("|" + value.next()+ "|");
			System.out.println("");
			lineNumber += 1;
		}
	}

	public String generateRegex(String str){
		String result = "";
		int dotCounter = 0;
		
		for(int i = 0 ; i < str.length() ; ++i){
			if(str.charAt(i) == '.'){
				dotCounter++;
				if(i == str.length() - 1) {
					if(dotCounter == 1){
						result += "[a-z]";
					} else {
						result += "[a-z]{" + dotCounter +"}";
					}
				}
			} else {
				if(dotCounter == 1){
					result += "[a-z][" + str.charAt(i) + "]";
				} else if(dotCounter == 0) {
					result += "[" + str.charAt(i) + "]";		
				} else {result += "[a-z]{"+dotCounter+"}["+ str.charAt(i) +"]";
					dotCounter = 0;
				}
			}
		}
		return result;
		
	}

}
