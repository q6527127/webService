package com.cn;

import javax.jws.WebService;

@WebService
//(endpointInterface = "com.cn.Service", serviceName = "Service",portName="ServicePort") 
public class ServiceImpl implements Service{

	public String setHello(String name) {
		System.out.println("调用成功了："+name);
		return "aaaaa"+name;
	}

}
