package Sample3_10;
public class Sample3_10 
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();

		car1.setNumGas(1234,20.5);
		car1.show();
		
		System.out.println("���w�����T���T�o�q{-10,0}�ݬ�");
		
		car1.setNumGas(1234,-10);
		car1.show();
	}
}

//Car���O
class Car
{
	private int num;
	private double gas;
	
	public void setNumGas(int n, double g)
	{
		if(g>0&&g<100)
		{
			num = n;
			gas = g;
			System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
		}
		else
		{
			System.out.println(g+"���O���T���T�o�q");
			System.out.println("�L�k�ܧ�T�o�q");
		}
	}
	void show()
	{
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
	}
}
