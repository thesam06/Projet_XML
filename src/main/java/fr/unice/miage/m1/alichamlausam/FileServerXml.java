package fr.unice.miage.m1.alichamlausam;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.resource.Resource;
import org.mortbay.xml.XmlConfiguration;

public class FileServerXml {
    public static void main(String[] args) throws Exception
    {
        Resource fileserver_xml = Resource.newSystemResource("fileserver.xml");
        XmlConfiguration configuration = new XmlConfiguration(fileserver_xml.getInputStream());
        Server server = (Server)configuration.configure();
        server.start();
        server.join();
    }
}
