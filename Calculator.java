
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
				String regexp = "[\\n,]";
				String[] arr = string.split(regexp);
				// Need to handle unlimited number of arguments
				int sum = 0;
				for (int i=0; i<arr.length; i++) {
					sum += StringToInt(arr[i]);
				}
				return sum;
			}
			
		}
		return StringToInt(string);
	}

}
