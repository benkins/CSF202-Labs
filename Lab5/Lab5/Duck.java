public abstract class Duck{

	protected IFlyBehaviour flyBehaviour;
	protected IQuackBehaviour quackBehaviour;

	public abstract void display();

	public void performFly(){
		flyBehaviour.fly();
	}

	public void performQuack(){
		quackBehaviour.quack();
	}
}
