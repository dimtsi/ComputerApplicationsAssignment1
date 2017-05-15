package assignment1;

public class RatioTapChanger {

	private String rdfID;
	private String name;
	private int step;
	private String sqldrop = "DROP TABLE IF EXISTS RatioTapChangers";
	private String sqlCreate = "CREATE TABLE IF NOT EXISTS RatioTapChangers(TAPCHANGER_ID VARCHAR(37) NOT NULL, name VARCHAR(8) , "
			+ "step INT , PRIMARY KEY(TAPCHANGER_ID))";
			
	
	public RatioTapChanger (String id, String nm, String Step){
		rdfID = id;
		name = nm;
		step = Integer.parseInt(Step);
	}
	
	public String GetrdfID(){ return rdfID; }
	
	public String GetName(){ return name; }
	
	public int GetStep(){ return step; }
	
	public String DropTable(){ return sqldrop; }
	
	public String CreateTable(){ return sqlCreate; }
	
}
