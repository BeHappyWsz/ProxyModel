package cglibDemo;

import target.ProxyTarget;

public class CglibTest {

	public static void main(String[] args) {
		ProxyTarget target = new ProxyTarget();
		
		ProxyTarget proxy = (ProxyTarget) new ProxyFactory(target).getProxyInstance();
		
		proxy.print();
	}

}
