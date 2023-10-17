package Que2;

class Box2 <T>
{
	private T obj;
	public void setData(T val)
	{
		this.obj = val;
	}
	public T getData()
	{
		return this.obj;
	}

}
public class GenericClassTestQ2 {
	
	public static void printDisplayableBox(Box2<? extends Displayable> b)
	{
		b.getData().displayData();
	}

	public static void printAnyBox(Box2<?>b)
	{
		System.out.println(b.getData().toString());
	}

	public static void main(String[] args) {
		
		Box2<Person1> b1 = new Box2<>();
		b1.setData(new Person1("Niraj",23));
		printDisplayableBox(b1);
		//printAnyBox(b1);
		System.out.println();
		
		Box2<Date> b2 = new Box2<>();
		b2.setData(new Date(19,3,2000));
		//printDisplayableBox(b2);
		printAnyBox(b2);
		System.out.println();
//		
//		Box2<String>b3 = new Box2<>();
//		//printDisplayableBox(b3);
//		b3.getData(new String("Shiva"));
//		printAnyBox(b2);
	}

}