package base;


public interface IBasePage {
	
	public void waitForLoad(int seconds);
	
	public void waitForLoad();
	
	public CustomDriver driver();
}