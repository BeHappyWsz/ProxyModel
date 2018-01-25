package staticDemo;

import target.ProxyInterface;

/**
 * 静态代理-代理对象
 * @author wsz
 * @date 2018年1月21日
 */
public class ProxyObject implements ProxyInterface{
	
	private ProxyInterface target;
	
	public ProxyObject(ProxyInterface target) {
		this.target = target;
	}
	
	@Override
	public void print() {
		System.out.println("11");
		target.print();
		System.out.println("22");
	}

}
