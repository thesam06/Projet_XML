package fr.unice.miage.m1.alichamlausam;

import javax.ws.rs.*;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.*;

/**
 * Created by alisontemin on 02/01/2018.
 */
@ApplicationPath("/rest")
public class MyApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Class[] classes = { CentreDeRechercheService.class, PersonneService.class};
		Set<Class<?>> res = new HashSet<Class<?>>();
		for(Class c : classes) {
			res.add(c);
		}
		return res;
	}

}
