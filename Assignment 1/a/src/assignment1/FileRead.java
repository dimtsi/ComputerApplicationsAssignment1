package assignment1;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;


public class FileRead {
	
	Document doc = null;
	Document doc1 = null;
	
	public void Parse(){
	
		try {
			final JFileChooser chooser = new JFileChooser("user.dir");
			File workingDirectory = new File(System.getProperty("user.dir"));
			chooser.setCurrentDirectory(workingDirectory);
			chooser.setDialogTitle("Choose EQ File");
	        chooser.setApproveButtonText("OK");
			int returnVal = chooser.showOpenDialog(null);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				   System.out.println("You chose to open this file: " +
				        chooser.getSelectedFile().getName());
				}
			
			File XmlFile = new File(chooser.getSelectedFile().getName());
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance(); //Build Document Factory
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder(); 
			
			chooser.setDialogTitle("Choose SSH File");
	        chooser.setApproveButtonText("OK");
			int returnVal1 = chooser.showOpenDialog(null);
			if(returnVal1 == JFileChooser.APPROVE_OPTION) {
				   System.out.println("You chose to open this file: " +
				        chooser.getSelectedFile().getName());
			doc = dBuilder.parse(XmlFile);
			File XmlFile1 = new File(chooser.getSelectedFile().getName());
			DocumentBuilderFactory dbFactory1 = DocumentBuilderFactory.newInstance(); 
			DocumentBuilder dBuilder1 = dbFactory1.newDocumentBuilder();
			doc1 = dBuilder1.parse(XmlFile1);
			}
			}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("No xml file. Please choose an xml file for parsing");
			System.exit(0);
			}
	}
	
}
