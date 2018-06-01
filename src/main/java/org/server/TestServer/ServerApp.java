package org.server.TestServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@ComponentScan(basePackages = {"org.test.server.action"})
@SpringBootApplication
public class ServerApp 
{
	  public static void main( String[] args ){
	    	SpringApplication.run(ServerApp.class, args);
	    }
}
