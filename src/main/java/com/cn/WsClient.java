/**
 * 
 */
/**
 * @author xiaodi
 *
 */
package com.cn;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;
class WsClient{
	private static final javax.xml.namespace.QName SERVICE_NAME   
    = new QName("http://ws.bless.com/", "Service");  
	private static final QName PORT_NAME   
	    = new QName("http://ws.bless.com/", "ServicePort");  
	
		
	public static void main(String[] args) {
		 Service service = javax.xml.ws.Service.create(SERVICE_NAME);  
	        // Endpoint Address  
	        String endpointAddress = "http://localhost:8089/webservice/ws";  
	  
	        // Add a port to the Service  
	        com.cn.Service hw = service.getPort(com.cn.Service.class);  
	        System.out.println(hw.setHello("World"));  
//		ServiceImplService fack = new ServiceImplService();
//		ServiceImpl impl = fack.getServiceImplPort();
//		System.out.println(impl.setHello("xd"));
	}
}