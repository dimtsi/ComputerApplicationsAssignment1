package assignment1;

public class VoltageLevel {
	
		private String rdfID;
		private double name;
		private String substation;
		private String BaseVoltage;
		private String sqldrop = "DROP TABLE IF EXISTS VoltageLevels";
		private String sqlCreate = "CREATE TABLE IF NOT EXISTS VoltageLevels(VOLTAGE_ID VARCHAR(37) NOT NULL, name DOUBLE , "
				+ "substation VARCHAR(37) , Base_Voltage VARCHAR(37) , PRIMARY KEY(VOLTAGE_ID),"
				+ "FOREIGN KEY (substation) REFERENCES Substations(SUBSTATION_ID) ON DELETE CASCADE ON UPDATE CASCADE,"
				+ "FOREIGN KEY (Base_Voltage) REFERENCES BaseVoltages(ID) ON DELETE CASCADE ON UPDATE CASCADE)";
		
		public VoltageLevel (String id, String nm, String sub, String BV){
			rdfID = id;
			name = Double.parseDouble(nm);
			substation = sub;
			BaseVoltage = BV;
		}
		
		public String GetrdfID(){ return rdfID; }
		
		public double GetName(){return name; }
		
		public String GetSub(){ return substation.substring(1); }
		
		public String GetBV(){ return BaseVoltage.substring(1); }
		
		public String DropTable(){ return sqldrop; }
		
		public String CreateTable(){ return sqlCreate; }		

}
