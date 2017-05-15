package assignment1;

public class Check {
	
	private boolean check;
	private int BusID;
	
	public Check(boolean ch , int busid){
		check = ch;
		BusID = busid;
	}
	
	public boolean GetCheck() { return check; }
	
	public int GetBusID() { return BusID; }

}
