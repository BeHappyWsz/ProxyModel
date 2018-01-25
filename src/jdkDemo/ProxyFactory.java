package jdkDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK-代理工厂类
 * @author wsz
 * @date 2018年1月21日
 */
public class ProxyFactory {

	private Object target;

	public ProxyFactory(Object target) {
		super();
		this.target = target;
	}
	
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("111");
				Object returnValue = method.invoke(target, args);
				System.out.println("222");
				return returnValue;
			}
			
		});
	}
	
}
