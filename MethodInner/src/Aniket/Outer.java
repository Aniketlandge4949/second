package Aniket;

 class Outer
{
	void m1()
	{
		class Inner
		{
			void sum(int x,int y)
			{
				System.out.println("sum is:"+(x+y));
				
			}
		}
		Inner i=new Inner();i.sum(10, 20);i.sum(70, 60);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Outer o=new Outer();
o.m1();
	}

}
