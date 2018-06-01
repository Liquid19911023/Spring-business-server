package org.test.server.action;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	 private final Logger logger = Logger.getLogger(getClass());
	    @Autowired
	    private DiscoveryClient client;

	    @RequestMapping(value = "/alcy", method = RequestMethod.GET)
	    public String index() {
	    	System.out.println("66666666666666666666666666666");
	        List<ServiceInstance> instances = client.getInstances("test-service");
	        for (int i = 0; i < instances.size(); i++) {
	            logger.info("/hello,host:" + instances.get(i).getHost() + ",service_id:" + instances.get(i).getServiceId());
	        }
	        return "test  success";
	    }

}


