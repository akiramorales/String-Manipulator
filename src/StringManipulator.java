public class StringManipulator {

	public String noVowels(String strIn)
	{
		String strReturn = "";
		for(int i = 0; i < strIn.length(); i++)
		{
			if(strIn.charAt(i) == 'a' || strIn.charAt(i) == 'A')
			{
				return strReturn +  "*";
			}
			else if(strIn.charAt(i) == 'e' || strIn.charAt(i) == 'E')
			{
				return strReturn + "*";
			}
			else if(strIn.charAt(i) == 'i' || strIn.charAt(i) == 'I')
			{
				return strReturn + "*";
			}
			else if(strIn.charAt(i) == 'o' || strIn.charAt(i) == 'O')
			{
				return strReturn + "*";
			}
			else if(strIn.charAt(i) == 'u' || strIn.charAt(i) == 'U')
			{
				return strReturn + "*";
			}
			else
			{
				return strReturn + strIn.charAt(i);
			}
		}
		return strReturn;
	}
	
	public String reverse(String strIn)
	{
		String strReturn = "";
		for(int i = strIn.length()-1; i < strIn.length(); i--)
		{
			return strReturn + strIn.charAt(i);
		}
		return strReturn;
	}
}
