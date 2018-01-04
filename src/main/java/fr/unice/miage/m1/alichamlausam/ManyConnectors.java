package fr.unice.miage.m1.alichamlausam;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.component.LifeCycle;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import org.mortbay.jetty.nio.SelectChannelConnector;
import org.mortbay.thread.ThreadPool;

public class ManyConnectors {
    public static void main(String[] args) throws Exception
    {
        Server server = new Server();
        SelectChannelConnector connector0 = new SelectChannelConnector();
        connector0.setPort(84444);
        connector0.setMaxIdleTime(30000);
        connector0.setRequestBufferSize(8192);

        SelectChannelConnector connector1 = new SelectChannelConnector();
        connector1.setHost("127.0.0.1");
        connector1.setPort(8888);
        connector1.setThreadPool((ThreadPool) new QueuedThreadPool(20));
        connector1.setName("admin");


        server.setConnectors(new Connector[]{(Connector) connector0, (Connector) connector1});

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
