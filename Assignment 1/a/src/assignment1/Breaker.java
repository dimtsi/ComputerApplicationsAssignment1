package assignment1;

public class Breaker {

	private String rdfID , name , EqCont , State;
	int ID , terminal_1 , terminal_2; 
	private String sqldrop = "DROP TABLE IF EXISTS Breakers";
	private String sqlCreate = "CREATE TABLE IF NOT EXISTS Breakers(BREAKER_ID VARCHAR(38) NOT NULL, name VARCHAR(100) ,"
			+ " status VARCHAR(5) , Equipment_Container VARCHAR(38) , PRIMARY KEY(BREAKER_ID),"
			+ "FOREIGN KEY (Equipment_Container) REFERENCES VoltageLevels(VOLTAGE_ID) ON DELETE CASCADE ON UPDATE CASCADE)";
	
	public Breaker (int id , String rdfid, String nm, String eq, String state , int term1 , int term2){
		ID = id;
		rdfID = rdfid;
		name = nm; 
		EqCont = eq;
		State = state;
		terminal_1 = term1;
		terminal_2 = term2;
	}
	
	public String GetrdfID(){ return rdfID; }
	
	public int GetID(){ return ID; }
	
	public int GetTerm1(){ return terminal_1; }
	
	public int GetTerm2(){ return terminal_2; }
	
	public String GetName(){ return name; }
	
	public String GetEqCon(){ return EqCont.substring(1); }
	
	public String GetState(){ return State; }
	
	public String DropTable(){ return sqldrop; }
	
	public String CreateTable(){ return sqlCreate; }
	
}
