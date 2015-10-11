
public class Calculator {

	public int add(String string) {
		if(string.isEmpty())
		{
			return 0;
		}
		else if (!string.isEmpty())
		{
			if(string.length() == 1)
			{
				return Integer.parseInt(string);
			}
			else
			{
				String[] arr = string.split(",");
				return (Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
			}
			
		}
		return Integer.parseInt(string);
	}

}
