package fr.unice.miage.m1.alichamlausam;
import org.xmldb.api.base.*;
import org.xmldb.api.modules.*;
import org.xmldb.api.*;
import javax.xml.transform.OutputKeys;
import org.exist.xmldb.EXistResource;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String URI = "xmldb:exist://localhost:8080/exist/xmlrpc";
		    /**
		     * args[0] Should be the name of the collection to access
		     * args[1] Should be the name of the resource to read from the collection
		     */
		   
		        
		        final String driver = "org.exist.xmldb.DatabaseImpl";
		        
		        // initialize database driver
		        Class cl = null;
				try {
					cl = Class.forName(driver);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        Database database = null;
				try {
					database = (Database) cl.newInstance();
				} catch (InstantiationException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        try {
					database.setProperty("create-database", "true");
				} catch (XMLDBException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        try {
					DatabaseManager.registerDatabase(database);
				} catch (XMLDBException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
		        Collection col = null;
		        XMLResource res = null;
		        try {    
		            // get the collection
		            try {
						col = DatabaseManager.getCollection(URI + "/db/ProjetXML");
					} catch (XMLDBException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		            try {
						col.setProperty(OutputKeys.INDENT, "no");
					} catch (XMLDBException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		            try {
					res = (XMLResource)col.getResource("abs.xml");
			
					} catch (XMLDBException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		            
		            if(res == null) {
		                System.out.println("document not found!");
		            } else {
		                try {
							System.out.println(res.getContent());
						} catch (XMLDBException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		            }
		        } finally {
		            //dont forget to clean up!
		            
		            if(res != null) {
		                try { ((EXistResource)res).freeResources(); } catch(XMLDBException xe) {xe.printStackTrace();}
		            }
		            
		            if(col != null) {
		                try { col.close(); } catch(XMLDBException xe) {xe.printStackTrace();}
		            }
		        }
		    }
	}


