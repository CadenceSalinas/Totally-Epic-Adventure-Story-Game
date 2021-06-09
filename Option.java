public class Option
{
	private boolean isUsed;
	private int opt;

	public Option(boolean isUsed, int opt)
	{
		this.isUsed = false;
		this.opt = 0;
	}

	//getters and setters
	public boolean getUsed()
	{
		return isUsed;
	}
	public int getOpt()
	{
		return opt;
	}

	public void setUsed(boolean used)
	{
		this.isUsed = used;
	}
	public void setOpt(int setOpt)
	{
		this.opt = setOpt;
	}

	//toString
	public String toString()
	{
		String output = "Is Used?: " + isUsed +
										" Option: " + opt;
		return output;
	}
}