package fr.unice.miage.m1.alichamlausam;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.mortbay.jetty.servlet.ServletHolder;

public class OneServetContext {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8444);
        OneContext context = new OneContext();
        server.setHandler((Handler) context);
    }
}
