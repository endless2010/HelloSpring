package com.mycompany.factory;

import org.springframework.beans.factory.FactoryBean;

public class StoneAxeFactoryBean implements FactoryBean<Axe>{

	@Override
	public Axe getObject() throws Exception {
		return new StoneAxe();
	}

	@Override
	public Class<?> getObjectType() {
		return Axe.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
