package Sample3_12;
public class Sample3_12 
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		car1.show();
	}
}

//Car���O
class Car
{
	private int num;
	private double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}