package A;

public class Encapsulation {

	private int i;//declaration
	
	//intilation
	public Encapsulation(int i) {
		this.i=i;//non local variableand local variable are 
		//are same that we can use the this keyword.
	}
	//utilization
	 public void setValue(int j)
	{
		 
		i=j;
	}
	 
public int getValue()
{
	return i;
}
}
