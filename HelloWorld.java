import java.util.Arrays;

public class HelloWorld{

	public static void main(String[] args){
	String str = "ahdkwnhdlsh";
	char[] test = str.toCharArray();
	Arrays.sort(test);

	for(char letter: test)
	{
		System.out.print(letter);
	}
}
}