package assignment1;

import java.util.ArrayList;

public class Help {// a class saying that Bus (BusID) is connected  to the
				   // buses in the ArrayList (sameList)
	private int BusID;
	private ArrayList<Integer> sameList = new ArrayList<Integer> ();
 
	public Help(int id , ArrayList <Integer> b){
		sameList = b;
		BusID = id;
	}
 
	public int GetBusID(){ return BusID; }
	public ArrayList<Integer> GetList(){ return sameList; }


}
