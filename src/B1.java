
public class B1 {
private int a;
	public B1(int a) {
		//when local and global variable is same and we want to assign
		// so we have to use this keyword
		this.a=a;
		
	}
	public void setValue(int b)
	{
		a=b;
	}
	public int getValue()
	{
		return a;
	}

}
