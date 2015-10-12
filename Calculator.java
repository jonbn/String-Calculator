
public class Calculator {
	
	private boolean isEmpty(String string) {
		return string.isEmpty();
	}
	
	private int StringToInt(String string) {
		return Integer.parseInt(string);
	}
	
	private int addNumbers(String[] numbers) {
		int sum = 0;
		for (int i=0; i<numbers.length; i++) {
			sum += StringToInt(numbers[i]);
		}
		return sum;
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
			else if (string.startsWith("//"))
			{
				String delim = string.substring(2, 3);
				String tempo = string.substring(4);
				String[] arr = tempo.split(delim);
				return addNumbers(arr);
			}
			else
			{
				String[] arr = string.split("[\\n,;]");
				return addNumbers(arr);
			}
			
		}
		return StringToInt(string);
	}

}
