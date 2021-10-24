package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
	
	public static void main(String[] args) {
		//핵심 기능 인스턴스 생성
		CoreFunc core = new ConcreteCoreFunc();
		//프록시 객체 생성=> aop 구현
		CoreFunc proxy = (CoreFunc) Proxy.newProxyInstance(ConcreteCoreFunc.class.getClassLoader(),
				new Class[] {CoreFunc.class},
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) {
						
						System.out.println("핵심 기능 전 부분 by 프록시");
						try {
							method.invoke(core, args);
						} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
							e.printStackTrace();
						}finally {
							System.out.println("핵심 기능 후 부분 by 프록시");
						}
						return null;
					}
				});
		
		proxy.corefunc();
	}
}
