package assignment1;

public class Substation {
	
	private String rdfID;
	private String SRegion;
	private String name;
	private String sqldrop = "DROP TABLE IF EXISTS Substations";
	private String sqlCreate = "CREATE TABLE IF NOT EXISTS Substations(SUBSTATION_ID VARCHAR(37) NOT NULL, name VARCHAR(12) , Region VARCHAR(37) , PRIMARY KEY(SUBSTATION_ID))";
	
	public Substation(String id, String nm, String sr){
		rdfID = id;
		name = nm;
		SRegion = sr;
	}
	
	public String GetrdfID(){ return rdfID; }
	
	public String GetName(){ return name; }	
	
	public String GetRegion(){ return SRegion.substring(1); }
	
	public String DropTable(){ return sqldrop; }
	
	public String CreateTable(){ return sqlCreate; }

}
