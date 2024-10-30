import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
 *    В результате сравнения в консоль должно быть выведено одно из сообщений:
 *    "Строки неидентичны" или "Строки идентичны".
 */
public class Test2
{
	public static void main(String[] args)
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// String A.
		System.out.println("Введите строку A:");
		String a = null;
		try
		{
			a = reader.readLine();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		// String B.
		System.out.println("Введите строку B:");
		String b = null;
		try
		{
			b = reader.readLine();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		// "Строки неидентичны" или "Строки идентичны".
		if (a.equals(b))
		{
			System.out.println("Строки идентичны");
		}
		else
		{
			System.out.println("Строки неидентичны");
		}

		try
		{
			reader.close();
		}
		catch (IOException e)
		{
		}
	}
}
