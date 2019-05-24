package training.spring.test;

import org.springframework.beans.factory.BeanClassLoaderAware;

public class A implements BeanClassLoaderAware {
	public A() {
		System.out.println("Bean A is Initialized.");
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("parent class loader:" + classLoader.getParent());
		System.out.println(classLoader.getSystemClassLoader());
	}
}