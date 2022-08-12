import java.util.stream.IntStream;
//IntStream : 原始整數值元素的序列

public class fizzBuzz 
{
	public static void main(String[] fizzBuzz) 
		{
	    	fizzBuzz(10);
	    	fizzBuzz1();
	    }
	//使用兩種方法判斷0到100的字串
	private static void fizzBuzz(int num) 
	{
		for (int i = 0 ; i<=num ;i++)
			//使用for迴圈設定一個整數i從0開始一直+1至字串的最大數
		{
			if (((i%3)==0)&&((i%5)==0))
				System.out.println("fizzBuzz");
			//如果i可以被3整除也可以被5整除則輸出fizzBuzz
			else if ((i%3)==0)
				System.out.println("fizz");
			//如果i可以被3整除則輸出fizz
			else if ((i%5)==0)
				System.out.println("Buzz");
			//如果i可以被5整除則輸出Buzz
			else
				System.out.println(i);
			//如果i無法整除則輸出自己
		}
			System.out.println("---------------");
	}
	private static void fizzBuzz1() 
	{
	    IntStream.rangeClosed(0, 10)
	    //使用IntStream.rangeClosed設定範圍0至100
	    //IntStream rangeClosed(int startInclusive,int endInclusive)
	    //startInclusive : 包含的初始值,endInclusive : 包含上限
	        .mapToObj(
	        		i -> i % 3 == 0 ? 
	        				(i % 5 == 0 ? "FizzBuzz" : "Fizz") : 
	        					(i % 5 == 0 ? "Buzz" : i))
	        .forEach(System.out::println);
	}
}
