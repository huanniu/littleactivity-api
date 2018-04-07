package com.beststudio.la.server;

import com.beststudio.la.rest.resource.ActivityResource;
import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;


public class RestServer {
    public static void main(String[] args) throws Exception {
        URI baseUri = UriBuilder.fromUri("http://127.0.0.1/").port(9090).build();
        ResourceConfig config = new ResourceConfig(ActivityResource.class);
        Server server = JettyHttpContainerFactory.createServer(baseUri, config);
    }
}