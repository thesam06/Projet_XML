package fr.unice.miage.m1.alichamlausam;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.mortbay.jetty.webapp.WebAppContext;

public class OneWebApp {
  
        public static void main(String[] args) throws Exception
        {
            Server server = new Server(8444);

            WebAppContext context = new WebAppContext();
            String webapp = "";
            context.setDescriptor(webapp+"/WEB-INF/web.xml");
            context.setResourceBase("../test-jetty-webapp/src/main/webapp");
            context.setContextPath("/");
            context.setParentLoaderPriority(true);

            server.setHandler((Handler) context);

            server.start();
            server.join();
        }
    }

