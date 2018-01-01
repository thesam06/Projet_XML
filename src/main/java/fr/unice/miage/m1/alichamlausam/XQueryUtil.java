package fr.unice.miage.m1.alichamlausam;

import org.exist.xmlrpc.*;
import org.exist.*;
import org.exist.storage.*;
import org.xmldb.api.base.*;
import org.xmldb.api.modules.*;
import java.util.*;
import org.xmldb.api.*;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import javax.xml.transform.OutputKeys;
import org.exist.xmldb.EXistResource;
import org.exist.security.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.io.*;
import java.net.*;
import javax.xml.bind.DatatypeConverter;


public class XQueryUtil {

	public static final String OUTPUT_FILE = "groupe.xqy";

	public static final String LIEN_COLLECTION = "http://localhost:8080/exist/rest/db/raweb/";

	public static String execXQuery(String nomFunction){
		String res = "";
		String credEnc = getEncodedCredentials();
		try{
			URL url =new URL(LIEN_COLLECTION+OUTPUT_FILE+"?fn="+nomFunction);
			HttpURLConnection huc = (HttpURLConnection)url.openConnection();
			huc.setRequestMethod("GET");
			huc.setRequestProperty("Authorization","Basic " + credEnc );
			huc.setRequestProperty("User-Agent","Mozilla-5.0");

			BufferedReader br= new BufferedReader(new InputStreamReader(huc.getInputStream()));
			for (String line= br.readLine() ;line!=null; line=br.readLine() ) {
				res+=line;
				
			}

		}catch(IOException e){
			res = e.getMessage();
			e.printStackTrace();

		}
		return res;

	}


	private static String getEncodedCredentials(){
		//Authencification de la base de donnée (http basic authorization)
		String auth = "admin:";
		//1 ça prend le usname:  le mot de passe
		//2 le crypter avec le system base64
		//3 rajouter une entete qui s'appelle authorization dans la requete http qui a coe valeur "Basic " suivie par le precedent
		String credEnc = DatatypeConverter.printBase64Binary(auth.getBytes(StandardCharsets.UTF_8));
		return credEnc;
	}

	
	public static void uploadFile(String name ) {
		try {
			String credEnc =getEncodedCredentials();

			//Se connecter a existbd et y uploader le fichier groupe.xqy
			URL url = new URL(LIEN_COLLECTION+ OUTPUT_FILE );
			System.out.println(url);
			HttpURLConnection huc = (HttpURLConnection)url.openConnection();
			huc.setDoOutput(true);
			huc.setRequestMethod("PUT");
			huc.setRequestProperty("Authorization","Basic " + credEnc );
			huc.setRequestProperty("User-Agent","Mozilla-5.0");

			//Copier le fichier xquery vers la existdb
			PrintWriter pw = new PrintWriter(huc.getOutputStream());
			BufferedReader xr = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/resources/"  + name)));
			for(String line = xr.readLine(); line !=null; line = xr.readLine()) {
				pw.println(line);
			}
			pw.close();
			xr.close();

			BufferedReader br = new BufferedReader(new InputStreamReader(huc.getInputStream()));
			for(String line = br.readLine(); line != null ; line = br.readLine()) {
				System.out.println(line);
			}
			br.close();
		} catch(IOException   e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		uploadFile("test.xqy");
	}
}