package assignment1;

public class PowerTransformer {
	
	Complex Y , Ysh;
	private String rdfID , name , EqCont;
	private int ID , PTE_1 , PTE_2; 
	private String sqldrop = "DROP TABLE IF EXISTS PowerTransformers";
	private String sqlCreate = "CREATE TABLE IF NOT EXISTS PowerTransformers(TRANSFORMER_ID VARCHAR(37) NOT NULL, name VARCHAR(8) ,"
			+ " Equipment_Container VARCHAR(37) , PRIMARY KEY(TRANSFORMER_ID),"
			+ "FOREIGN KEY (Equipment_Container) REFERENCES Substations(SUBSTATION_ID) ON DELETE CASCADE ON UPDATE CASCADE)";
	
	public PowerTransformer(int id , int pt1 , int pt2 , String rdfid, String nm , String eq , Complex y , Complex ysh ){
		ID = id;
		rdfID = rdfid;
		PTE_1 = pt1; 
		PTE_2 = pt2;
		name = nm;
		EqCont = eq;
		Y = y;
		Ysh = ysh;
	}
	
	public int GetID(){ return ID; }
	
	public String GetrdfID(){ return rdfID; }
	
	public int GetTerm1(){ return PTE_1; }
	
	public int GetTerm2(){ return PTE_2; }
	
	public String GetName(){ return name; }
	
	public String GetEqCont(){ return EqCont.substring(1); }
	
	public String DropTable(){ return sqldrop; }
	
	public String CreateTable(){ return sqlCreate; }
	
	public Complex GetY(){ return Y; }
	
	public Complex Getysh(){ return Ysh; }
	
}
