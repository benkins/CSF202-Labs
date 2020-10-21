public class DecoyDuck extends Duck{
	public DecoyDuck() {
		this.flyBehaviour = new FlyNoWay();
		this.quackBehaviour = new MuteQuack();
	}

	public void display()
	{
		System.out.println("Display: I only look like a duck!");
	}
}
