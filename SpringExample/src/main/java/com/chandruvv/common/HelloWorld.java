package com.chandruvv.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{
	private String name;
	private int age;
	
	private List<String> listobjs;
	private HashMap<String, Integer> map;
	private Set<String> sets;
	
	public Set<String> getSets() {
		return sets;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	public HashMap<String, Integer> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}

	public List<String> getListobjs() {
		return listobjs;
	}

	public void setListobjs(List<String> listobjs) {
		this.listobjs = listobjs;
	}

	
	HelloWorld(String name)
	{
		this.name=name;
	}
		
	HelloWorld(){
		
	}
	HelloWorld(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	HelloWorld(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public void printHello() {
		System.out.println("Hello ! " + name);
	}
	
	public void initmethod()
	{
		System.out.println("Custom Init method being called");
	}
	public void destroymethod()
	{
		System.out.println("Custom Destroy method being called");
	}

	public void printlists()
	{
		System.out.println("Printing lists from Injection");
		for(String str: listobjs)
		{
			System.out.println(str);
		}
	}
	
	public void printmaps()
	{
		System.out.println("Printing maps from Injection");
		for(Map.Entry<String,Integer> entr: map.entrySet())
		{
			System.out.println(entr.getKey()+ "=" + entr.getValue());
		}
	}
	
	public void printsets()
	{
		System.out.println("Printing sets from Injection");
		for(String str: sets)
		{
			System.out.println(str);
		}
	}
}
