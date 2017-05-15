package assignment1;

public class PowerTransformerEnd {

	private String rdfID , name , Transformer , baseVoltage;
	private int terminal , ID;
	private double r , x , b , g , S , U , BaseV;
	private double Sbase;
	private String sqldrop = "DROP TABLE IF EXISTS PowerTransformerEnds";
	private String sqlCreate = "CREATE TABLE IF NOT EXISTS PowerTransformerEnds(WINDING_ID  VARCHAR(37) NOT NULL, name VARCHAR(8) , Transformer VARCHAR(37) , Base_Voltage VARCHAR(37) , r DOUBLE , x DOUBLE , PRIMARY KEY(WINDING_ID),"
			+ "FOREIGN KEY (Transformer) REFERENCES PowerTransformers(TRANSFORMER_ID) ON DELETE CASCADE ON UPDATE CASCADE,"
			+ "FOREIGN KEY (Base_Voltage) REFERENCES BaseVoltages (ID) ON DELETE CASCADE ON UPDATE CASCADE)";

	public PowerTransformerEnd (int id , String rdfid, String nm, String trnsf, String BV , String R, String X ,String B , String G , String s , String u , double baseV , int term , double Sbase){
		ID = id;
		rdfID = rdfid;
		name = nm; 
		Transformer = trnsf;
		baseVoltage = BV;
		r = Double.parseDouble(R);
		x = Double.parseDouble(X);
		b = Double.parseDouble(B);
		g = Double.parseDouble(G);
		S = Double.parseDouble(s);
		U = Double.parseDouble(u);
		BaseV = baseV;
		terminal = term;
		this.Sbase = Sbase;
	}
	
	public int GetTerminal() { return terminal; }
	
	public int GetID() { return ID; }
	
	public String GetrdfID(){ return rdfID; }
	
	public String GetName(){ return name; }
	
	public String GetTransf(){ return Transformer.substring(1); }
	
	public String GetBV(){ return baseVoltage.substring(1); }
	
	public double GetR(){ return r; }
	
	public double GetX(){ return x; }
	
	public double GetB(){ return b; }
	
	public double GetG(){ return g; }
	
	public double GetS(){ return S; }
	
	public double GetU(){ return U; }
	
	public Complex GetY(){
			Complex Z = new Complex(r , x); 
			if (r == 0 && x == 0){ return Z;}
			Complex Y = Z.reciprocal();
			return Y.multi((Math.pow(BaseV, 2)/Sbase)); //pu
	}
		
	public Complex Getysh(){
			Complex y = new Complex (g/2 , b/2);
			return y.multi((Math.pow(BaseV, 2)/Sbase));
	}
	
	public String DropTable(){ return sqldrop; }
	
	public String CreateTable(){ return sqlCreate; }
	
}
