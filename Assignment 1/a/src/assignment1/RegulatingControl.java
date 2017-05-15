package assignment1;

public class RegulatingControl {
	private String rdfID;
	private String name;
	private double targetValue;
	private String sqldrop = "DROP TABLE IF EXISTS RegulatingControls";
	private String sqlCreate = "CREATE TABLE IF NOT EXISTS RegulatingControls(REGCONTROL_ID VARCHAR(37) NOT NULL, name VARCHAR(8) , target_Value DOUBLE , PRIMARY KEY(REGCONTROL_ID))";
	
	public RegulatingControl(String id, String nm, String tV){
		rdfID = id;
		name = nm;
		targetValue = Double.parseDouble(tV);
	}
	
	public String GetrdfID(){ return rdfID; }
	
	public String GetName(){ return name; }
	
	public double GetnV(){ return targetValue; }

	public String DropTable(){ return sqldrop; }
	
	public String CreateTable(){ return sqlCreate; }
	
}
