package programming;

public class Parameter {

	static void reverse (String str , String rev)
	{
		for(int i = str.length()-1 ; i >= 0 ; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(rev))
		{
			System.out.println("its palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
	public static void main(String[] args) {
		
           reverse ("kayaka" , "");
           reverse ("nayana" , "");
           reverse("appa" , "");
	}

}
