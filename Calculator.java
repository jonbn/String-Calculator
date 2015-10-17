import java.util.ArrayList;
import java.util.List;


public class Calculator {
	
	private boolean isEmpty(String string) {
		return string.isEmpty();
	}
	
	private int StringToInt(String string) {
		return Integer.parseInt(string);
	}
	
	private int addNumbers(String[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
				if(StringToInt(numbers[i]) > 1000)
				{
					continue;
				}
				else
				{
					sum += StringToInt(numbers[i]);
				}
		}
		return sum;
	}
	
	private boolean containsNegative(String[] numbers) {
		for(int i = 0; i < numbers.length; i++)
		{
			if(StringToInt(numbers[i]) < 0)
			{
				return true;
			}
		}
		return false;
	}

	public int add(String string) {
		String[] arr = null;
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
				//     //;\n     //***###\n1***2###3
				int delim_end = string.indexOf("\n");   
				String delim = string.substring(2, 3);
				//String tempo = string.substring(4);
				String tempo = string.substring(delim_end + 1);
				arr = tempo.split(delim);
			}
			else
			{
				arr = string.split("[\\n,]");
			}
			if(containsNegative(arr))
			{
				List keep = new ArrayList();
				for(int i = 0; i < arr.length; i++)
				{
					if (StringToInt(arr[i]) < 0)
					{
						keep.add(arr[i]);
					}
						
				}
				throw new ArithmeticException("Negatives not allowed: " + keep.toString().replaceAll("\\[|\\]", ""));
			}
			return addNumbers(arr);
			
		}
		return StringToInt(string);
	}

}
