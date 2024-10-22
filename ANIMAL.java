abstract class Animal
{
	abstract void eat();
	abstract void sleep();
}
class Lion extends Animal
{
	void eat()
	{
		System.out.println("Lion is eating curisouly");

	}
	void sleep()
	{
		System.out.println("Lion is sleeping 12 hours a day");
	}
}
class Tiger extends Animal
{
	void eat()
	{
		System.out.println("Tiger is eating deer");
        }
	void sleep()
	{
		System.out.println("Tiger is sleeping 9 hours a day");
	}
}		
class Deer extends Animal
{
	void eat()
	{
		System.out.println("Deer is waiting to eat something");
	}
	void sleep()
	{
		System.out.println("Deer is acting like a eating");
	}
}
public class Main
{
	public static void main(String[] args)
	{
		Lion lion = new Lion();
		Tiger tiger = new Tiger();
		Deer deer = new Deer();
		lion.eat();
		lion.sleep();
		tiger.eat();
		tiger.sleep();
		deer.eat();
		deer.sleep();
	}
}


OUTPUT:

