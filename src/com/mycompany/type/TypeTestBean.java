package com.mycompany.type;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TypeTestBean {
	private boolean booleanType;
	private char charType;
	private Integer intType;
	private Long longType;
	private float floatType;
	private double doubleType;
	private String[] arrayType;
	private List<String> listType;
	private Set<String> setType;
	private Map<String,String> mapType;
	private List<Object> complexlistType;
	private Set<Object> complexsetType;
	private Map<Object,Object> complexmapType;
	private Properties propertyType;
	public void display(){
		System.out.println("booleanType:"+booleanType);
		System.out.println("charType:"+charType);
		System.out.println("intType:"+intType);
		System.out.println("longType:"+longType);
		System.out.println("floatType:"+floatType);
		System.out.println("doubleType:"+doubleType);
		System.out.println("arrayType:"+Arrays.toString(arrayType));
		System.out.println("listType:"+listType);
		System.out.println("setType:"+setType);
		System.out.println("mapType:"+mapType);
		System.out.println("complexlistType:"+complexlistType);
		System.out.println("complexsetType:"+complexsetType);
		System.out.println("complexmapType:"+complexmapType);
		System.out.println("propertyType:"+propertyType);
	}

	public boolean isBooleanType() {
		return booleanType;
	}

	public void setBooleanType(boolean booleanType) {
		this.booleanType = booleanType;
	}

	public char getCharType() {
		return charType;
	}

	public void setCharType(char charType) {
		this.charType = charType;
	}

	public Integer getIntType() {
		return intType;
	}

	public void setIntType(Integer intType) {
		this.intType = intType;
	}

	public Long getLongType() {
		return longType;
	}

	public void setLongType(Long longType) {
		this.longType = longType;
	}

	public float getFloatType() {
		return floatType;
	}

	public void setFloatType(float floatType) {
		this.floatType = floatType;
	}

	public double getDoubleType() {
		return doubleType;
	}

	public void setDoubleType(double doubleType) {
		this.doubleType = doubleType;
	}

	public String[] getArrayType() {
		return arrayType;
	}

	public void setArrayType(String[] arrayType) {
		this.arrayType = arrayType;
	}

	public List<String> getListType() {
		return listType;
	}

	public void setListType(List<String> listType) {
		this.listType = listType;
	}

	public Set<String> getSetType() {
		return setType;
	}

	public void setSetType(Set<String> setType) {
		this.setType = setType;
	}

	public Map<String, String> getMapType() {
		return mapType;
	}

	public void setMapType(Map<String, String> mapType) {
		this.mapType = mapType;
	}

	public Properties getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(Properties propertyType) {
		this.propertyType = propertyType;
	}

	public List<Object> getComplexlistType() {
		return complexlistType;
	}

	public void setComplexlistType(List<Object> complexlistType) {
		this.complexlistType = complexlistType;
	}

	public Set<Object> getComplexsetType() {
		return complexsetType;
	}

	public void setComplexsetType(Set<Object> complexsetType) {
		this.complexsetType = complexsetType;
	}

	public Map<Object, Object> getComplexmapType() {
		return complexmapType;
	}

	public void setComplexmapType(Map<Object, Object> complexmapType) {
		this.complexmapType = complexmapType;
	}
}
