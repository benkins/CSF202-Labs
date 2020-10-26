public class MallardDuck extends Duck{
	public MallardDuck() {
		this.flyBehaviour = new FlyWithWings();
		this.quackBehaviour = new Quack();
	}

	public void display()
	{
		System.out.println("Display: I look like a lovely Mallard Duck");
	}
}
