public class Permutate{
	
	public void permutate(String given , String toPrint){

		if(given.length() == 0){
			System.out.println(toPrint);
		}
		
		for(int i = 0 ; i < given.length() ; ++i){
		char currentChar = given.charAt(i);
		String rest = given.substring(0 , i) +
			given.substring(i + 1);

		permutate(rest , toPrint + currentChar);
		}
	}
}
