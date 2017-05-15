package assignment1;

public class Terminal {
	
	private int ID , ConnNode;
	private String rdfID;
	private String CondEq;
	
	public Terminal(int id , String rdfid, String ce , int cn ){
		ID = id;
		rdfID = rdfid;
		CondEq = ce;
		ConnNode = cn;
	}
	
	public int GetID(){ return ID; }
	
	public String GetrdfID(){ return rdfID; }
	
	public String GetCondEq(){ return CondEq.substring(1); }	
	
	public int GetConnNode(){ return ConnNode; }
	
}
