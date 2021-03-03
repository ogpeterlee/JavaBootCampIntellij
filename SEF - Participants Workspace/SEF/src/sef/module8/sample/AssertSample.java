package sample;
// Needs to be completed
//Run this class with -ea option enabled in JVM arguments
public class AssertSample {

	public static void test()
	{
		//1 - Type assert 5 %2 and 6%2 in separate statements
		assert 5%2 ==10;
		assert 6%2 ==10;
	}
	public static void main(String arg[]){
		//2 - Call test()
		
		AssertSample.test();
	}			
}
