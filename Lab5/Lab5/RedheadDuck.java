public class RedheadDuck extends Duck{
	public RedheadDuck() {
		this.flyBehaviour = new FlyWithWings();
		this.quackBehaviour = new Quack();
	}

	public void display()
	{
		System.out.println("Display: I look like a Duck with a nice red head.");
	}
}
