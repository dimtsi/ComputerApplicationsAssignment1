package assignment1;

public class BusbarSection {
	
	private String rdfID ;
	private int ID , terminal;
	
	public BusbarSection (String rdfid , int id , int term){
		rdfID = rdfid;
		ID = id;
		terminal = term;
	}
	
	public String GetrdfID(){ return rdfID; }
	
	public int GetID(){ return ID; }
	
	public int GetTerm(){ return terminal; }
	
}
