package com.cn;

import javax.jws.WebMethod;

@javax.jws.WebService
public interface Service {
	@WebMethod
	String setHello(String name);
}
