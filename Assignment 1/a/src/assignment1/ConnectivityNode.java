package assignment1;

public class ConnectivityNode {
	
	private int ID;
	private String rdfID;
	
	public ConnectivityNode (String rdfid , int id){
		rdfID = rdfid;
		ID = id;
	}
	
	public String GetrdfID(){ return rdfID; }
	
	public int GetID(){ return ID; }
	
}
