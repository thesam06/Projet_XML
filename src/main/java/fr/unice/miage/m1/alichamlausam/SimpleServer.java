package fr.unice.miage.m1.alichamlausam;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.component.LifeCycle;

public class SimpleServer {
    public static void main(String[] args) throws Exception
    {
        Server server = new Server(8888);
        server.setHandler(new TestHandler() {
            @Override
            public void start() throws Exception {

            }

            @Override
            public void stop() throws Exception {

            }

            @Override
            public boolean isRunning() {
                return false;
            }

            @Override
            public boolean isStarted() {
                return false;
            }

            @Override
            public boolean isStarting() {
                return false;
            }

            @Override
            public boolean isStopping() {
                return false;
            }

            @Override
            public boolean isStopped() {
                return false;
            }

            @Override
            public boolean isFailed() {
                return false;
            }

            @Override
            public void addLifeCycleListener(Listener listener) {

            }

            @Override
            public void removeLifeCycleListener(Listener listener) {

            }
        });
        server.start();
        server.join();
    }
}

