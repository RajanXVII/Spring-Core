package noxml;

import java.util.LinkedList;
import java.util.List;

import javax.sql.rowset.spi.SyncResolver;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

public class customprocessor implements BeanPostProcessor,BeanFactoryAware,DisposableBean {
	private BeanFactory beanFactory;
	private final List prototypebean=new LinkedList<>();
	@Override
	public Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException {
		if(beanFactory.isPrototype(beanName)) {
			synchronized(prototypebean){
			prototypebean.add(bean);
		}
		}
		return bean;
	}
	@Override
	public void setBeanFactory(BeanFactory bf) {
		this.beanFactory=bf;
	}
	
	@Override
	public void destroy() {
		synchronized(prototypebean) {
		for(Object bean:prototypebean) {
			if(bean instanceof DisposableBean) {
				DisposableBean dp=(DisposableBean)bean;
				try {
					dp.destroy();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		}
		prototypebean.clear();
		}
	}
	
	
}
