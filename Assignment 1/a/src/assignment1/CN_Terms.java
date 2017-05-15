package assignment1;

import java.util.ArrayList;

public class CN_Terms {
 
	private int ID;
	private ArrayList<Integer> terminals = new ArrayList<Integer> ();
 
	public CN_Terms(int id , ArrayList <Integer> b){
		terminals = b;
		ID = id;
	}
 
	public int GetID(){ return ID; }
	public ArrayList<Integer> GetList(){ return terminals; }

}
