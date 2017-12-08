
package net.dotmyself.bartering.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class BarteringApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(net.dotmyself.bartering.service.MemberResource.class);
        return classes;
	}

	
	
}
