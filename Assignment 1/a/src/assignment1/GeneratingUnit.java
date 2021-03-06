package assignment1;

public class GeneratingUnit {
	
	private String rdfID;
	private String name;
	private double Pmax;
	private double Pmin;
	private String equipmentCont;
	private String sqldrop = "DROP TABLE IF EXISTS GeneratingUnits";
	private String sqlCreate = "CREATE TABLE IF NOT EXISTS GeneratingUnits(GENUNIT_ID VARCHAR(37) NOT NULL, name VARCHAR(14) , "
			+ "Equipment_Container VARCHAR(37) , Pmax DOUBLE , Pmin DOUBLE , PRIMARY KEY(GENUNIT_ID),"
			+ "FOREIGN KEY (Equipment_Container) REFERENCES Substations(SUBSTATION_ID) ON DELETE CASCADE ON UPDATE CASCADE)";
	
	public GeneratingUnit (String id, String nm, String Pmx, String Pmn, String EC){
		rdfID = id;
		name = nm;
		Pmax = Double.parseDouble(Pmx);
		Pmin = Double.parseDouble(Pmn);
		equipmentCont = EC;
	}

	public String GetrdfID(){ return rdfID; }
	
	public String GetName(){ return name; }	
	
	public double GetPmax(){ return Pmax; }
	
	public double GetPmin(){ return Pmin; }
	
	public String GetEqCont(){ return equipmentCont.substring(1); }
	
	public String DropTable(){ return sqldrop; }
	
	public String CreateTable(){ return sqlCreate; }
	
}
