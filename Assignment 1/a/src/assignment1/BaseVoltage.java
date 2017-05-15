package assignment1;

public class BaseVoltage {

	private String rdfID;
	private double nominalV;
	private String sqldrop = "DROP TABLE IF EXISTS BaseVoltages";
	private String sqlCreate = "CREATE TABLE IF NOT EXISTS BaseVoltages(ID VARCHAR(37) NOT NULL, nominal_Voltage Double , PRIMARY KEY(ID))";
	
	public BaseVoltage(String id, String nV){
		rdfID = id;
		nominalV = Double.parseDouble(nV);
	}
	
	public String GetrdfID(){ return rdfID; }
	
	public double GetnV(){ return nominalV; }
	
	public String DropTable(){ return sqldrop; }
	
	public String CreateTable(){ return sqlCreate; }
}
