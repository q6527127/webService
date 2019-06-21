package com.cn;

import javax.xml.ws.Endpoint;

public class Main {
	public static void main(String[] args) {
		String address="http://localhost:8089/webservice/ws";
		Endpoint.publish(address, new ServiceImpl());
		System.out.println("发布webservice成功");
	}
}
