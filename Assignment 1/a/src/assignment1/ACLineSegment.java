package assignment1;

public class ACLineSegment {
	
	private String rdfID;
	private double BaseVoltage;
	private double l , R , X , b , g;
	private double Sbase;
	Complex Y, ysh; 
	private int terminal_1 , terminal_2 , ID;
	
	public ACLineSegment(int id , String rdfid, double bv , String L , String r , String x , String B , String G , int term1 , int term2 , double Sbase){
		ID = id;
		rdfID = rdfid;
		BaseVoltage = bv;
		l = Double.parseDouble(L);
		R = Double.parseDouble(r);
		X = Double.parseDouble(x);
		b = Double.parseDouble(B);
		g = Double.parseDouble(G);
		terminal_1 = term1;
		terminal_2 = term2;
		this.Sbase = Sbase;

	}
	
	public int GetID(){ return ID; }
	
	public String GetrdfID(){ return rdfID; }
	
	public double GetBaseVoltage(){ return BaseVoltage; }	
	
	public int GetTerm1() { return terminal_1; } 
	
	public int GetTerm2() { return terminal_2; } 
	
	public Complex GetY(){
		Complex Z = new Complex(l*R , l*X); 
		if (R == 0 && X == 0){ return Z; }
		Complex y = Z.reciprocal();
		return y.multi((Math.pow(this.BaseVoltage, 2)/Sbase)); //pu
	}
	
	public Complex Getysh(){
		Complex y = new Complex (l*g/2 , l*b/2);
		return y.multi((Math.pow(this.BaseVoltage, 2)/Sbase));
	}
}
