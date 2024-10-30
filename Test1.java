import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Написать программу, которая принимает на вход два целых числа (a и b)
 *    и совершает с ними следующие действия:
 *    - сравнивает эти два числа и возвращает результат сравнения путем вывода
 *      в консоль одного из вариантов: "a > b", "a < b" или "a = b";
 *    - совершает с этими числами операции сложения, вычитания,
 *      деления и умножения и результат выводит в консоль.
 */
public class Test1
{
	public static void main(String[] args)
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// Integer A.
		int a = 0;
		System.out.println("Введите целое число A:");

		boolean isNumber = false;
		while (!isNumber)
		{
			String userInput = null;

			try
			{
				userInput = reader.readLine();
				a = Integer.parseInt(userInput);
				isNumber = true;
			}
			catch (Exception e)
			{
				System.out.println("Введённая строка не является целым числом. Повторите ввод:");
				isNumber = false;
			}
		}

		// Integer B.
		int b = 0;
		System.out.println("Введите целое число B:");

		isNumber = false;
		while (!isNumber)
		{
			String userInput = null;

			try
			{
				userInput = reader.readLine();
				b = Integer.parseInt(userInput);
				isNumber = true;
			}
			catch (Exception e)
			{
				System.out.println("Введённая строка не является целым числом. Повторите ввод:");
				isNumber = false;
			}
		}

		// "a > b", "a < b" или "a = b".
		if (a < b)
		{
			System.out.println("A < B");
		}
		else if (a > b)
		{
			System.out.println("A > B");
		}
		else if (a == b)
		{
			System.out.println("A = B");
		}

		// Совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
		System.out.println("A + B = " + Integer.toString(a + b));
		System.out.println("A - B = " + Integer.toString(a - b));
		System.out.println("A / B = " + Integer.toString(a / b));
		System.out.println("A * B = " + Integer.toString(a * b));

		try
		{
			reader.close();
		}
		catch (IOException e)
		{
		}
	}
}
