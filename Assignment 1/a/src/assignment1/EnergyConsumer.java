package assignment1;

public class EnergyConsumer {
	
	private String rdfID;
	private String name;
	private String EqCont;
	private double P;
	private double Q;
	private String sqldrop = "DROP TABLE IF EXISTS EnergyConsumers";
	private String sqlCreate = "CREATE TABLE IF NOT EXISTS EnergyConsumers(CONSUMER_ID VARCHAR(37) NOT NULL, name VARCHAR(12) , "
			+ "Equipment_Container VARCHAR(37) , P DOUBLE , Q DOUBLE , PRIMARY KEY(CONSUMER_ID),"
			+ "FOREIGN KEY (Equipment_Container) REFERENCES VoltageLevels(VOLTAGE_ID) ON DELETE CASCADE ON UPDATE CASCADE)";
	
	public EnergyConsumer (String id, String nm, String eq, String p, String q ){
		rdfID = id;
		name = nm; 
		EqCont = eq;
		P = Double.parseDouble(p);
		Q = Double.parseDouble(q);
	}
	
	public String GetrdfID(){ return rdfID; }
	
	public String GetName(){
		return name;
	}
	
	public String GetEqCon(){
		return EqCont.substring(1);
	}
	
	public double GetP(){
		return P;
	}
	
	public double GetQ(){
		return Q;
	}
	
	public String DropTable(){
		return sqldrop;
	}
	
	public String CreateTable(){
		return sqlCreate;
	}

}


