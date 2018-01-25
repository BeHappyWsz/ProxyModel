package staticDemo;

import target.ProxyInterface;
import target.ProxyTarget;
/**
 * 静态代理-测试
 * @author wsz
 * @date 2018年1月21日
 */
public class StaticTest {

	public static void main(String[] args) {
		ProxyInterface target = new ProxyTarget();
		
		ProxyObject proxy = new ProxyObject(target);
		
		proxy.print();
	}

}
