package Sample3_5;
public class Sample3_5
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();

		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.showCar();
	}
}

//Car���O
class Car
{
	int num;
	double gas;

	void show()
	{
		System.out.println("�����O"+num);
		System.out.print("�T�o�q�O"+gas);
	}
	void showCar()
	{
		System.out.println("�}�l��ܨ��l���");
		this.show();
	}
}