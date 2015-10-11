
public class Calculator {
	
	private boolean isEmpty(String string) {
		return string.isEmpty();
	}
	
	private int StringToInt(String string) {
		return Integer.parseInt(string);
	}

	public int add(String string) {
		if(isEmpty(string))
		{
			return 0;
		}
		else if (!isEmpty(string))
		{
			if(string.length() == 1)
			{
				return StringToInt(string);
			}
			else
			{
				String[] arr = string.split(",");
				return (StringToInt(arr[0]) + StringToInt(arr[1]));
			}
			
		}
		return StringToInt(string);
	}

}
