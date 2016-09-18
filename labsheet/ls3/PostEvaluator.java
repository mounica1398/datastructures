import java.io.*;
class PostEvaluator
{
	public static void main(String[] args) throws IOException
	{
		String s;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Estack b=new Estack();
		System.out.println("Enter input string");
		s=br.readLine();
		System.out.println("Input String:"+s);
		System.out.println("Output String:");	
		b.evaluate(s);
	}
}
