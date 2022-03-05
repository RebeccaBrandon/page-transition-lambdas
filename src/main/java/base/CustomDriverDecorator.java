package base;

public abstract class CustomDriverDecorator extends CustomWebDriver {

	public CustomDriver driver;
	
	public CustomDriverDecorator(CustomDriver driver) {
		super();
		this.driver = driver;
	}

}