public class Main{
	public static void main(String[] args){
	Permutate permutate =new Permutate(Integer.parseInt(args[1]));
	permutate.permutate(args[0] , "");
	permutate.printSet();
	}
}
