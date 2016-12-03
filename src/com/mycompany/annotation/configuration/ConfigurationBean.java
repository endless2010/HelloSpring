package com.mycompany.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBean {
	
	@Bean
	public Axe stoneAxe(){
		//<bean id="stoneAxe" class="com.mycompany.annotation.configuration.StoneAxe" >
		return new StoneAxe();
	}
	
	@Bean
	public Axe steelAxe(){
		//<bean id="steelAxe" class="com.mycompany.annotation.configuration.SteelAxe" >
		return new SteelAxe();
	}
	
	@Bean
	public Person chinese(){
		/*		
		 * <bean id="chinese" class="com.mycompany.annotation.configuration.Chinese" >		
		 * <property name="axe" ref="stoneAxe" /> 
		 */
		return new Chinese(stoneAxe());
	}
}



