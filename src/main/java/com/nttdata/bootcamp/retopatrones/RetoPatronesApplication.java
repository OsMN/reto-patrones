package com.nttdata.bootcamp.retopatrones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.bootcamp.retopatrones.observer.Journalists;
import com.nttdata.bootcamp.retopatrones.observer.Newspaper;
import com.nttdata.bootcamp.retopatrones.observer.singleton.Singleton;

@SpringBootApplication
public class RetoPatronesApplication {
	static Singleton instanceOne = Singleton.getInstance();
	static Singleton instanceTwo = Singleton.getInstance();
	public static void main(String[] args) {
		SpringApplication.run(RetoPatronesApplication.class, args);
		//Patron builder usando lombok para simplificarlo, permite la construccion de diversos tipos de periodicos
		Newspaper newspaper1 = Newspaper.builder().newspaperName("ElPais").type("Digital").build();
		// Patron Observer
		Journalists journalist = new Journalists();
		// El periodista se subscribe a Media para recibir las noticias que ocurran
		journalist.media.subscribeNewsType("cocheVolcado", new Newspaper("ElMundo"));
		journalist.media.subscribeNewsType("corrupcion", newspaper1);
		// y luego publica las que hayan ocurrido en los periodicos.
		journalist.publishNewsType1();
		journalist.publishNewsType2();
		journalist.publishNewsType3();
		//Singleton
		Singleton uno = Singleton.getInstance();
		Singleton dos = Singleton.getInstance();
		System.out.println("Singleton uno tiene este hascode: "+ uno.hashCode());
		System.out.println("Singleton dos tiene este hascode: "+ dos.hashCode());
		//Si tienen el mismo se demuestra que estan en el mismo lugar en memoria, por lo que son el mismo objeto
	}

}
