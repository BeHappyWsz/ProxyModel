package staticDemo;

import target.ProxyInterface;

/**
 * ��̬����-�������
 * @author wsz
 * @date 2018��1��21��
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
