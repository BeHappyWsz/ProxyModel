package target;

/**
 * 被代理目标
 * @author wsz
 * @date  2018年1月21日
 */
public class ProxyTarget implements ProxyInterface{
	@Override
	public void print() {
		System.out.println("被代理目标");
	}
}
