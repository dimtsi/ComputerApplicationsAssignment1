package assignment1;

public class Ybus {
	
	private Complex Y;
	private Complex y;
	private int BusID_1,BusID_2;
	
	
	public Ybus(Complex Yb , Complex yb , int id1 , int id2){
		Y = Yb;
		y = yb;
		BusID_1 = id1;
		BusID_2 = id2;
	}
	
	public Complex GetY(){ return Y; }
	
	public Complex Gety(){ return y; }
	
	public int GetBusID1(){ return BusID_1; }
	
	public int GetBusID2(){ return BusID_2; }

}
