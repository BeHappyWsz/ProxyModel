package staticDemo;

import target.ProxyInterface;
import target.ProxyTarget;
/**
 * ��̬����-����
 * @author wsz
 * @date 2018��1��21��
 */
public class StaticTest {

	public static void main(String[] args) {
		ProxyInterface target = new ProxyTarget();
		
		ProxyObject proxy = new ProxyObject(target);
		
		proxy.print();
	}

}
