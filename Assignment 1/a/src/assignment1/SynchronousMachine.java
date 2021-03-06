package assignment1;

public class SynchronousMachine {
	
	private String rdfID;
	private String name;
	private String EqCont;
	private String RegCtrl;
	private String RotMGU;
	private double Srated;
	private double P;
	private double Q;
	private String sqldrop = "DROP TABLE IF EXISTS SynchronousMachines";
	private String sqlCreate = "CREATE TABLE IF NOT EXISTS SynchronousMachines(MACHINE_ID VARCHAR(37) NOT NULL, name VARCHAR(12) ,"
			+ " Equipment_Container VARCHAR(37) , Regulating_Control VARCHAR(37) , Generating_Unit VARCHAR(37) , Srated DOUBLE , P DOUBLE , Q DOUBLE ,  PRIMARY KEY(MACHINE_ID),"
			+ "FOREIGN KEY (Regulating_Control) REFERENCES RegulatingControls(REGCONTROL_ID) ON DELETE CASCADE ON UPDATE CASCADE,"
			+ "FOREIGN KEY (Equipment_Container) REFERENCES VoltageLevels(VOLTAGE_ID) ON DELETE CASCADE ON UPDATE CASCADE)";
	
	public SynchronousMachine (String id, String nm, String eq, String rc, String rm, String s, String p, String q ){
		rdfID = id;
		name = nm; 
		EqCont = eq;
		RegCtrl = rc;
		RotMGU = rm;
		Srated = Double.parseDouble(s);
		P = Double.parseDouble(p);
		Q = Double.parseDouble(q);
	}
	
	public String GetrdfID(){ return rdfID; }
	
	public String GetName(){ return name; }
	
	public String GetEqCont(){ return EqCont.substring(1); }
	
	public String GetRegCtrl(){ return RegCtrl.substring(1); }
	
	public String GetRotMcGU(){ return RotMGU.substring(1); }
	
	public double GetSrated(){ return Srated; }
	
	public double GetP(){ return P; }
	
	public double GetQ(){ return Q; }
	
	public String DropTable(){ return sqldrop; }
	
	public String CreateTable(){ return sqlCreate; }

}
