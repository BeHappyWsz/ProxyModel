package jdkDemo;

import target.ProxyInterface;
import target.ProxyTarget;
/**
 * JDK-≤‚ ‘
 * @author wsz
 * @date 2018ƒÍ1‘¬21»’
 */
public class JdkTest {

	public static void main(String[] args) {
		
		ProxyInterface target = new ProxyTarget();
		
		ProxyInterface proxy = (ProxyInterface) new ProxyFactory(target).getProxyInstance();
		
		proxy.print();
	}

}
