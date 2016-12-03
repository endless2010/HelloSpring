package com.mycompany.factory;

import org.springframework.beans.factory.FactoryBean;

public class SteelAxeFactoryBean implements FactoryBean<Axe>{
	Axe steelAxe=null;
	@Override
	public Axe getObject() throws Exception {
		if(steelAxe==null)
			steelAxe=new SteelAxe();
		return steelAxe;
	}

	@Override
	public Class<?> getObjectType() {
		return Axe.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
