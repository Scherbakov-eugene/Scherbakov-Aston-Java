/**
 * 3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10]
 *    необходимо написать программу, которая выведет в консоль все чётные числа.
 */
public class Test3
{
	public static void main(String[] args)
	{
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] % 2 == 0)
			{
				System.out.println(array[i]);
			}
		}
	}
}
