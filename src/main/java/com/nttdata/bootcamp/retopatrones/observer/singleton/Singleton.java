package com.nttdata.bootcamp.retopatrones.observer.singleton;

public class Singleton {

	private static Singleton singleInstance = null;
	public String texto;
	private Singleton()
	{
		texto = "texto por defecto";
	}
	
	public static Singleton getInstance()
	{
		if (singleInstance == null)
			singleInstance = new Singleton();
		return singleInstance;
	}
}
